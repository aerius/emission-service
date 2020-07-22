# AERIUS emission service - database

## About

Database part of the AERIUS emission service.

## Local development

### With docker

Prefered way to run and develop this application is through docker.

For this part a local docker installation is required.

To build the image, the following can be used (should be run in `{local_git_repository_folder}/aerius-emission-service/source/database/`):

```
docker build ./ --build-arg SFTP_READONLY_PASSWORD={the_correct_password} --build-arg DATABASE_VERSION={the_correct_version} --tag emission_database
```

To run this image and have the database available on port 5445, the following can be used:

```
docker run --detach --publish 5445:5432 --name emission_database emission_database
```

### Without docker

In some cases, like troubleshooting, it can be useful to run without docker. This does require some more setup however.

To run without docker, the following procedure can be used:

Ensure a ruby installation with required gems is available (TODO: ruby version and specific gem/versions).
Ensure a postgres installation is available, along with postgis. Tested on postgres 12.2 with postgis 3.0.

Checkout this project in a location, say `{local_git_repository_folder}/aerius-emission-service`.
Checkout the `aerius/aerius-database-build` project next to this location, say `{local_git_repository_folder}/aerius-database-build`.

Create a file `{local_git_repository_folder}/aerius-database-build/settings.user.rb` and add the necessary properties for the local environment. 
This should be at least `$pg_password` and `$sftp_data_readonly_password`.
Look at settings.rb to get a hint at which other properties might be set.

Now a set of commands can be used for development purposes while in the root directory of the `database` module (that is, `{local_git_repository_folder}/aerius-emission-service/source/database/`).

To test structure of the database (to detect faults in table declarations and such):

```
ruby ../../../aerius-database-build/bin/Build.rb test_structure.rb settings.rb -v structure
```

To download required data files from the SFTP server. 

```
ruby ../../../aerius-database-build/bin/SyncDBData.rb settings.rb --from-sftp --to-local
```

To build an actual database.

```
ruby ../../../aerius-database-build/bin/Build.rb default.rb settings.rb -v "some_recognizable_version" -n "aerius-emissions"
```
