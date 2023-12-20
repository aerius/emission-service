#!/usr/bin/env bash

# Exit on error
set -e

# Change current directory to directory of script so it can be called from everywhere
SCRIPT_PATH=$(readlink -f "${0}")
SCRIPT_DIR=$(dirname "${SCRIPT_PATH}")
cd "${SCRIPT_DIR}"

# include functions
source ./include.functions.sh

#####################
### The real deal ###
#####################

echo '# Update docker-compose docker image'
_update_image_docker-compose
echo

# Push images
echo '# Pushing images'
_docker-compose -f "${DOCKER_COMPOSE_PATH}" --project-directory "${GENERATED_DIRECTORY}" push

