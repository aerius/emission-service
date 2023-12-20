# AERIUS emission service - REST service

## About

REST service part of the AERIUS emission service.

## Local development

### With docker

Prefered way to run and develop this application is through docker.

For this part a local docker installation is required.

To build the image, the following can be used (should be run in `{local_git_repository_folder}/aerius-emission-service/source/rest-service/`):

```
docker build ./ --tag emission_rest_service
```

Since the rest-service needs the [emission-database](../database/) it's easiest to create a docker network containing both this service and the database.
If not yet made, create the network. Attach the database image to it if it's already running.

```
docker network create emission_network
docker network connect emission_network emission_database
```

To run the rest-service image and have the service available on port 8085, the following can be used:

```
docker run --detach --publish 8085:8080 --network emission_network --name emission_rest_service emission_rest_service
```

The application should now be reachable, and status can be retrieved by going to `http://localhost:8085/api/v1/actuator/health`.
Startup log can be seen by using `docker logs emission_rest_service` (useful if for instance the status is down).

### Without docker

In some cases, like troubleshooting, it can be useful to run without docker. 

You can use a normal `mvn clean package` to obtain a jar that you can run.
Alternatively, and most likely more useful, you can run/debug the application in your favorite IDE using `EmissionServiceApplication` as main class.
In that case, you can create a file `{local_git_repository_folder}/aerius-emission-service/source/rest-service/config/application.properties` to supply your configuration or use environment variables.

## JOOQ

We're using JOOQ to query the database.

For more information about JOOQ, see https://www.jooq.org/

### Generating JOOQ classes

JOOQ supports generating classes based on a database.
This can be done through a maven plugin, however we usually don't want to depend on a database during build time.
Hence the generated classes are added to version control.

The JOOQ classes can be generated in the following way:

* Create a database with the name `emissionservice_source_generator` based on the database part of this project.
* Ensure the `aerius` user exists in the database (or adjust pom.xml to your own liking)
* Run `mvn generate-sources -P generate-jooq` (run normal `generate-sources` maven goal with the `generate-jooq` profile)
