/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.i18n;


import nl.aerius.emissionservice.db.generated.i18n.tables.Messages;
import nl.aerius.emissionservice.db.generated.i18n.tables.SystemInfoMessages;
import nl.aerius.emissionservice.db.generated.i18n.tables.records.MessagesRecord;
import nl.aerius.emissionservice.db.generated.i18n.tables.records.SystemInfoMessagesRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * i18n.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<MessagesRecord> MESSAGES_PKEY = Internal.createUniqueKey(Messages.MESSAGES, DSL.name("messages_pkey"), new TableField[] { Messages.MESSAGES.KEY, Messages.MESSAGES.LANGUAGE_CODE }, true);
    public static final UniqueKey<SystemInfoMessagesRecord> SYSTEM_INFO_MESSAGES_PKEY = Internal.createUniqueKey(SystemInfoMessages.SYSTEM_INFO_MESSAGES, DSL.name("system_info_messages_pkey"), new TableField[] { SystemInfoMessages.SYSTEM_INFO_MESSAGES.LANGUAGE_CODE }, true);
}
