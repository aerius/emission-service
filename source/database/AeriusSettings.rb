# Empty placeholder that will be included at some point in the build step.
# 
# Needed because a property is expected when collecting comments, and that same property is used to include ruby source at some point during the database build.
# This should probably be fixed in aerius-database-build, but till that is done we use an empty placeholder.
#
# This file is also used to determine the AeriusSettings.user.rb file, which is used in the docker build to include things like the SFTP password (which should not be in git).
