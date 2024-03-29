/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.public_.routines;


import nl.aerius.emissionservice.db.generated.public_.Public;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;



/**
 * @deprecated Unknown data type. If this is a qualified, user-defined type, it
 * may have been excluded from code generation. If this is a built-in type, you
 * can define an explicit {@link org.jooq.Binding} to specify how this type
 * should be handled. Deprecation can be turned off using {@literal
 * <deprecationOnUnknownTypes/>} in your code generator configuration.
 */
@Deprecated
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AeEnumByIndex extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyenum\""), false, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> ANYENUM = Internal.createParameter("anyenum", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyenum\""), false, false);

    /**
     * The parameter <code>public.ae_enum_by_index.index</code>.
     */
    public static final Parameter<Integer> INDEX = Internal.createParameter("index", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public AeEnumByIndex() {
        super("ae_enum_by_index", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyenum\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(ANYENUM);
        addInParameter(INDEX);
    }

    /**
     * Set the <code>anyenum</code> parameter IN value to the routine
     */
    public void setAnyenum(Object value) {
        setValue(ANYENUM, value);
    }

    /**
     * Set the <code>anyenum</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setAnyenum(Field<Object> field) {
        setField(ANYENUM, field);
    }

    /**
     * Set the <code>index</code> parameter IN value to the routine
     */
    public void setIndex(Integer value) {
        setValue(INDEX, value);
    }

    /**
     * Set the <code>index</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setIndex(Field<Integer> field) {
        setField(INDEX, field);
    }
}
