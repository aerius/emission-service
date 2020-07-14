clear_log

check_datasources
create_database

begin
  import_database_structure
  update_comments

  load_data

  generate_html_documentation
  generate_rtf_documentation

  analyze_vacuum_database :vacuum, :analyze
end
