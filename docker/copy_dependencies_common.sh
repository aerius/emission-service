#!/usr/bin/env bash

# Do not execute this script yourself, make use of the 'copy_dependencies.sh' scripts as present in the profile directories. e.g.: in directory 'nl'.

SOURCE_DIR='..'
DOCKER_COMMON_DIR='common'

# Exit on error
set -e

# Change current directory to directory of script so it can be called from everywhere
SCRIPT_PATH=$(readlink -f "${0}")
SCRIPT_DIR=$(dirname "${SCRIPT_PATH}")
cd "${SCRIPT_DIR}"

# include functions
source ./include.functions.sh

# database
# create source directory and put all sources in there so we can use a single COPY statement in the Dockerfile
# (make sure it's isolated in 1 layer instead of multiple)
if _is_module_enabled "${1}" 'database'; then
  mkdir -p "${DOCKER_COMMON_DIR}"/database/source
  cp -Rauv "${SOURCE_DIR}"/source/database \
           "${DOCKER_COMMON_DIR}"/database/source/
fi

# rest-service
# This service is build within docker, so move the source to the correct location
if _is_module_enabled "${1}" 'api'; then
  cp -auv "${SOURCE_DIR}"/source/rest-service \
          "${DOCKER_COMMON_DIR}"/api/
fi

# Change current directory to previous one so scripts calling this one can function properly
cd - > /dev/null
