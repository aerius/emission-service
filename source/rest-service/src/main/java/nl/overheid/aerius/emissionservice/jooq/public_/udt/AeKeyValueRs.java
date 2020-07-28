/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_.udt;


import java.math.BigDecimal;

import nl.overheid.aerius.emissionservice.jooq.public_.Public;
import nl.overheid.aerius.emissionservice.jooq.public_.udt.records.AeKeyValueRsRecord;

import org.jooq.Schema;
import org.jooq.UDTField;
import org.jooq.impl.DSL;
import org.jooq.impl.SchemaImpl;
import org.jooq.impl.UDTImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AeKeyValueRs extends UDTImpl<AeKeyValueRsRecord> {

    private static final long serialVersionUID = 854188975;

    /**
     * The reference instance of <code>public.ae_key_value_rs</code>
     */
    public static final AeKeyValueRs AE_KEY_VALUE_RS = new AeKeyValueRs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AeKeyValueRsRecord> getRecordType() {
        return AeKeyValueRsRecord.class;
    }

    /**
     * The attribute <code>public.ae_key_value_rs.key</code>.
     */
    public static final UDTField<AeKeyValueRsRecord, BigDecimal> KEY = createField(DSL.name("key"), org.jooq.impl.SQLDataType.NUMERIC, AE_KEY_VALUE_RS, "");

    /**
     * The attribute <code>public.ae_key_value_rs.value</code>.
     */
    public static final UDTField<AeKeyValueRsRecord, BigDecimal> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.NUMERIC, AE_KEY_VALUE_RS, "");

    /**
     * No further instances allowed
     */
    private AeKeyValueRs() {
        super("ae_key_value_rs", null, null, false);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC != null ? Public.PUBLIC : new SchemaImpl(DSL.name("public"));
    }
}
