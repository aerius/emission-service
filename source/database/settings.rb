#
# Product specific settings. Can optionally override in settings.user.rb (same location)
#

$product = :emission_service

#-------------------------------------

sql_load_path = '/src/main/sql/load/'
sql_module_path = '/src/main/sql/'
scripts_path = '/src/main/scripts/'
data_path = '/src/data/sql/'
settings_file = 'AeriusSettings.rb'
local_data_path = 'data_emission_service'

#-------------------------------------

# project_settings_file is not really applicable here, but if we don't supply it an error will occur when comments are collected.
# This should probably be fixed in aerius-database-build, but for now use an empty placeholder.
$project_settings_file = File.expand_path(File.dirname(__FILE__) + '/' + settings_file).fix_pathname

# Path(s) to SQL files containing structure
# Using a specific folder containing the load SQL, which uses the module mechanic available in the build script to import in the right order.
# This way we avoid having to prepend folders with 00_, 01_ etc. Same approach as the load.rb used for data really.
$product_sql_path = File.expand_path(File.dirname(__FILE__) + '/' + sql_load_path).fix_pathname
$common_sql_paths = [File.expand_path(File.dirname(__FILE__) + '/' + sql_module_path).fix_pathname]

# Path(s) to directory containing load.rb and accompanying SQL files that load the data
$product_data_path = File.expand_path(File.dirname(__FILE__) + '/' + data_path).fix_pathname
# We can't leave the common data path empty, hence we just add the same path again.
$common_data_paths = [$product_data_path]

# Path to scripts that can be used during a build, like test_structure.rb.
$runscripts_path = File.expand_path(File.dirname(__FILE__) + '/' + scripts_path).fix_pathname

# Directory on SFTP server that contains data for this application
$dbdata_dir = 'db-data/aeriusII/'
# Path to the dir on the local drive containing that data (location to sync files to before actually importing these into a database).
$dbdata_path = File.expand_path(File.dirname(__FILE__) + '/../../../' + local_data_path + '/' + $dbdata_dir).fix_pathname

# Git bin folder, should be in PATH. If not specified, some location will be used.
$git_bin_path = ''

$database_name_prefix = 'AERIUS'

$db_function_prefix = 'ae'

# Connection details, to be overriden per environment.
$pg_username = 'aerius' # Username for database
$pg_password = '' # Password for database

$source = :sftp
$target = :local
$sftp_data_path = 'sftp://aerius-sftp.rivm.nl/' # Location of SFTP server

$sftp_data_readonly_username = 'aeriusro' # Username for sftp server
$sftp_data_readonly_password = '' # Password for sftp server
