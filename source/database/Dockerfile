FROM nexus-docker.aerius.nl/database-build:1.1.0-psql_15-pgis_3.4

# Required arguments needed for building this dockerfile.
# The readonly password should correspond to the sftp_data_path and sftp_data_readonly_username in settings.rb
# The database version can be whatever, should be something proper when using this in a production environment however.
ARG SFTP_READONLY_PASSWORD
ARG DATABASE_VERSION

# Set the correct environment variables for this project.
# DBDATA_PATH should match $db_data in settings.rb
# DBCONFIG_PATH should point to the location of AeriusSettings.rb
# DBRUNSCRIPT should be a valid .rb script in src/main/scripts
# DBSOURCE_PATH should be the path containing our database source
# DATABASE_NAME will be the resulting database name
ENV DBDATA_PATH="/data_emission_service/db-data/aeriusII" \
    DBCONFIG_PATH="/source/aerius-emission-database" \
    DBRUNSCRIPT="docker" \
    DBSOURCE_PATH="/source/aerius-emission-database" \
    DATABASE_NAME="emissions"

# Copy over the database source files
COPY . /source/aerius-emission-database/

# Start the actual database build
RUN /build-database.sh
