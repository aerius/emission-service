#!/usr/bin/env bash

# Docker image that we will use to run `yq`
YQ_DOCKER_IMAGE='mikefarah/yq:3'

# Docker image that we will use to run `docker-compose`
COMPOSE_DOCKER_IMAGE='linuxserver/docker-compose:alpine'

# Directory to put generated theme/files in
GENERATED_DIRECTORY='generated'

# docker-compose.yaml path
DOCKER_COMPOSE_PATH="${GENERATED_DIRECTORY}/docker-compose.yaml"

# Custom profile filename
CUSTOM_PROFILE_FILENAME='custom.profile'

# function to print error and exit
# $1 = error message
function _error() {
  echo '[ERROR] - '"${1}"
  exit 1
}

# function to check if a module is enabled
# $1 = contains modules that are enabled separated by space or empty/not set which means all modules are enabled
# $2 = module to check for
function _is_module_enabled() {
  [[ -z "${1}" ]] || [[ "${1}" == *" ${2} "* ]]
  return $?
}

# function to call yq via Docker - all arguments will be passed along to the yq binary
# yq is a YML processor
function _yq() {
  docker run --rm -i -v "${PWD}":/workdir "${YQ_DOCKER_IMAGE}" yq "${@}"
}

# function to update yq image
function _update_image_yq() {
  docker pull "${YQ_DOCKER_IMAGE}"
}

# function to copy a block of yaml into the resulting yaml
# $1 = yaml to copy to
# $2 = yaml to copy from
# $3 = path of block to copy
function _copy_yaml_block_into() {
  local TEMPFILE="${GENERATED_DIRECTORY}/${3}.yaml"
  touch "${TEMPFILE}"

  _yq read -e "${2}" "${3}" > "${TEMPFILE}"
  _yq prefix --inplace "${TEMPFILE}" "${3}"
  _yq merge -i "${1}" "${TEMPFILE}"
}

# function to call docker-compose via Docker - all arguments will be passed along to the docker-compose binary
# If OVERRIDE_ENV_VARIABLES is set (should be an associative array) it's contents will be added as ENV variables to the Docker run command
# Every AERIUS_* env variable will be automatically exported.
function _docker-compose() {
  local ADDITIONAL_ARGS=()
  for OVERRIDE_ENV_VARIABLE in "${!OVERRIDE_ENV_VARIABLES[@]}"; do
    ADDITIONAL_ARGS+=('-e' "${OVERRIDE_ENV_VARIABLE}=${OVERRIDE_ENV_VARIABLES[${OVERRIDE_ENV_VARIABLE}]}")
  done
  while read ENV_LINE; do
    ADDITIONAL_ARGS+=('-e' "${ENV_LINE%%=*}")
  done < <(env | grep '^AERIUS_')

  # if a local config.json exists, also use it in the docker-compose container
  if [[ -f "${HOME}/.docker/config.json" ]]; then
    ADDITIONAL_ARGS+=('-v' "${HOME}/.docker/config.json:/root/.docker/config.json")
  fi
  docker run --rm -i \
    -v /var/run/docker.sock:/var/run/docker.sock \
    -e COMPOSE_DOCKER_CLI_BUILD=1 \
    -e DOCKER_BUILDKIT=1 \
    -v "${PWD}":/workdir \
    -w="/workdir" \
    "${ADDITIONAL_ARGS[@]}" "${COMPOSE_DOCKER_IMAGE}" "${@}"
}

# function to update docker-compose image
function _update_image_docker-compose() {
  docker pull "${COMPOSE_DOCKER_IMAGE}"
}
