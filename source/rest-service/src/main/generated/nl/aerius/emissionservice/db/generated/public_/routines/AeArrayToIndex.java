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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AeArrayToIndex extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>public.ae_array_to_index.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.ae_array_to_index.anyarray</code>.
     */
    public static final Parameter<Object[]> ANYARRAY = Internal.createParameter("anyarray", SQLDataType.OTHER.getArrayDataType(), false, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> ANYELEMENT = Internal.createParameter("anyelement", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\""), false, false);

    /**
     * Create a new routine call instance
     */
    public AeArrayToIndex() {
        super("ae_array_to_index", Public.PUBLIC, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(ANYARRAY);
        addInParameter(ANYELEMENT);
    }

    /**
     * Set the <code>anyarray</code> parameter IN value to the routine
     */
    public void setAnyarray(Object[] value) {
        setValue(ANYARRAY, value);
    }

    /**
     * Set the <code>anyarray</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setAnyarray(Field<Object[]> field) {
        setField(ANYARRAY, field);
    }

    /**
     * Set the <code>anyelement</code> parameter IN value to the routine
     */
    public void setAnyelement(Object value) {
        setValue(ANYELEMENT, value);
    }

    /**
     * Set the <code>anyelement</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setAnyelement(Field<Object> field) {
        setField(ANYELEMENT, field);
    }
}
