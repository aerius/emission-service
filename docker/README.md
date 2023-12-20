# Docker

## Steps to run the application on a local Docker Swarm

Needs to be done once to setup Docker Swarm:

```bash
# Init Docker Swarm locally
$ docker swarm init
# Create web network to be used by traefik
$ docker network create -d overlay web
```

Full flow when starting from scratch, starting in root of the project.

```bash
# Export THEME so we can re-use which environment we are trying to build and deploy
cd source
$ export THEME=nl
# Go to Docker directory
$ cd ../docker
# Prepare docker environment (will copy dependencies build and more) *
$ ./prepare.sh
# Build the containers *
$ ./build.sh
# Deploy environment
$ docker stack deploy -c generated/docker-compose.yaml -c "${THEME}"/docker-compose.traefik.yaml "${THEME}"
# Get to it using http://localhost or http://127.0.0.1.
```

Some environment variables are required. The scripts will tell you which ones. I'd recommend to set them system-wide as they can be used in other products as well.
