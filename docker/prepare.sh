#!/usr/bin/env bash

# Exit on error
set -e

# Change current directory to directory of script so it can be called from everywhere
SCRIPT_PATH=$(readlink -f "${0}")
SCRIPT_DIR=$(dirname "${SCRIPT_PATH}")
cd "${SCRIPT_DIR}"

# include functions
source ./include.functions.sh

# Force THEME to nl by default
: ${THEME:='nl'}

####################
### Validations ###
###################

# Check for needed environment variables
: ${THEME?'THEME environment variable should be set, e.g.: nl'}

# Do format checks
! [[ "${THEME}" =~ ^[[:alnum:]-]*$ ]] && _error 'THEME contains bad characters'
! [[ "${PROFILE}" =~ ^[[:alnum:]-]*$ ]] && _error 'PROFILE contains bad characters'

# Check if theme exists
! [[ -d "${THEME}" ]] && _error 'Theme "'"${THEME}"'" not found.'

# Check if profile exists for theme if specified
! [[ -z "${PROFILE}" || -f "${THEME}/profiles/${PROFILE}.profile" ]] && _error 'Profile "'"${PROFILE}"'" does not exist for theme "'"${THEME}"'"'

#####################
### The real deal ###
#####################

DOCKER_COMPOSE_PATH="${GENERATED_DIRECTORY}"/docker-compose-original.yaml
FROM_DOCKER_COMPOSE_PATH="${THEME}"/docker-compose.yaml

# Create generated directory (ignore if it already exists)
mkdir -p "${GENERATED_DIRECTORY}"
# Remove already present generated files (if any)
rm -vf "${GENERATED_DIRECTORY}"/*

# If no profile is specified no processing is needed
if [[ -z "${PROFILE}" ]]; then
  echo '# Going to prepare theme "'"${THEME}"'" with no profile'

  # Create generated directory (ignore if it already exists)
  mkdir -p "${GENERATED_DIRECTORY}"
  # Remove already present generated files (if any)
  rm -vf "${GENERATED_DIRECTORY}"/*

  # Simply copy over the docker-compose.yaml
  cp "${FROM_DOCKER_COMPOSE_PATH}" "${DOCKER_COMPOSE_PATH}"

  # Execute copy_dependencies for theme
  echo '# Executing copy_dependencies.sh for theme'
  ./"${THEME}"/copy_dependencies.sh
  echo
# Else a profile is specified and we need to do some processing
else
  echo '# Update yq docker image'
  _update_image_yq
  echo

  echo '# Going to generate custom theme based on theme "'"${THEME}"'" and profile "'"${PROFILE}"'"'

  # Read in profile
  PROFILE_PATH="${THEME}/profiles/${PROFILE}.profile"
  source "${PROFILE_PATH}"

  # Validate required properties from profile
  [[ -z "${SERVICES[@]}" ]] && _error 'Theme "'"${THEME}"'" does not contain the required SERVICES property.'

  # Copy profile to generated directory
  cp "${PROFILE_PATH}" "${GENERATED_DIRECTORY}/${CUSTOM_PROFILE_FILENAME}"

  # Generate docker-compose.yaml based on the services
  echo '- Generating '"${DOCKER_COMPOSE_PATH}"

  # Create file and add header
  touch "${DOCKER_COMPOSE_PATH}"
  COMPOSE_HEADER_VERSION=$(_yq read "${FROM_DOCKER_COMPOSE_PATH}" version)
  _yq write -i "${DOCKER_COMPOSE_PATH}" --style single 'version' "${COMPOSE_HEADER_VERSION}"
  # Per service copy it into the docker-compose.yaml
  for SERVICE in "${SERVICES[@]}"; do
    echo '- Processing service: '"${SERVICE}"
    _copy_yaml_block_into "${DOCKER_COMPOSE_PATH}" "${FROM_DOCKER_COMPOSE_PATH}" 'services.'"${SERVICE}"
  done
  # Per volume copy it into the docker-compose.yaml
  for VOLUME in "${VOLUMES[@]}"; do
    echo '- Processing volume: '"${VOLUME}"
    _copy_yaml_block_into "${DOCKER_COMPOSE_PATH}" "${FROM_DOCKER_COMPOSE_PATH}" 'volumes.'"${VOLUME}"
  done
  echo

  # Execute copy_dependencies for theme
  echo '# Executing copy_dependencies.sh for theme'
  ./"${THEME}"/copy_dependencies.sh " ${SERVICES[*]} "
  echo
fi

# Copy .env from theme
echo '# Copying .env from theme'
cp "${THEME}"/.env "${GENERATED_DIRECTORY}"/
echo

# Process Dockerfile templates
echo '# Executing process_dockerfile_templates.sh'
./process_dockerfile_templates.sh
