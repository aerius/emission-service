/*
 * messages
 * --------
 * System table for localized messages.
 */
CREATE TABLE i18n.messages (
	key text NOT NULL,
	language_code i18n.language_code_type NOT NULL,
	message text,

	CONSTRAINT messages_pkey PRIMARY KEY (key, language_code)
);

/*
 * system_info_messages
 * --------------------
 * System info table for localized messages, for showing system messages.
 */
CREATE TABLE i18n.system_info_messages (
  language_code i18n.language_code_type NOT NULL,
  message text NOT NULL,

  CONSTRAINT system_info_messages_pkey PRIMARY KEY (language_code)
);
