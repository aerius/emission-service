#!/usr/bin/env bash

# Exit on error
set -e

# Change current directory to directory of script so it can be called from everywhere
SCRIPT_PATH=$(readlink -f "${0}")
SCRIPT_DIR=$(dirname "${SCRIPT_PATH}")
cd "${SCRIPT_DIR}"

# include functions
source ./include.functions.sh

# Set variables we will re-use multiple times
PROFILE_PATH="${GENERATED_DIRECTORY}/${CUSTOM_PROFILE_FILENAME}"
DOCKER_COMPOSE_ORIGINAL_PATH="${GENERATED_DIRECTORY}/docker-compose-original.yaml"

# Set variable with whether the custom profile file is found
[[ -f "${PROFILE_PATH}" ]] && PROFILE_PATH_FOUND=0 || PROFILE_PATH_FOUND=1

####################
### Validations ###
###################

# Check if a custom theme exists
if ! ( [[ -d "${GENERATED_DIRECTORY}" ]] || [[ -f "${DOCKER_COMPOSE_ORIGINAL_PATH}" ]] ); then
  _error 'Generated directory not found. Use prepare.sh to generate one first.'
fi

#####################
### The real deal ###
#####################

echo '# Update docker-compose docker image'
_update_image_docker-compose
echo

# Print ENV variables we should override for debugging reasons
echo '# ENV variables we should override (if any)'
for OVERRIDE_ENV_VARIABLE in "${!OVERRIDE_ENV_VARIABLES[@]}"; do
  echo '- '"${OVERRIDE_ENV_VARIABLE}=${OVERRIDE_ENV_VARIABLES[${OVERRIDE_ENV_VARIABLE}]}"
done
echo

# Get latest images (if needed)
echo '# Pulling latest images (if any)'
_docker-compose -f "${DOCKER_COMPOSE_ORIGINAL_PATH}" --project-directory "${GENERATED_DIRECTORY}" pull
echo

# Dump processed docker-compose.yaml
echo '# Dump processed docker-compose.yaml'
_docker-compose -f "${DOCKER_COMPOSE_ORIGINAL_PATH}" --project-directory "${GENERATED_DIRECTORY}" config > "${DOCKER_COMPOSE_PATH}"
echo

# Build images
echo '# Building images'
_docker-compose -f "${DOCKER_COMPOSE_PATH}" --project-directory "${GENERATED_DIRECTORY}" build --pull --parallel
