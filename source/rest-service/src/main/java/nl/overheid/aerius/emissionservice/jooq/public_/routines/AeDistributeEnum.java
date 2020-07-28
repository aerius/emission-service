/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_.routines;


import java.math.BigDecimal;

import nl.overheid.aerius.emissionservice.jooq.public_.Public;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AeDistributeEnum extends AbstractRoutine<BigDecimal[]> {

    private static final long serialVersionUID = -297109999;

    /**
     * The parameter <code>public.ae_distribute_enum.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType(), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _1 = Internal.createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyenum\""), false, true);

    /**
     * The parameter <code>public.ae_distribute_enum._2</code>.
     */
    public static final Parameter<BigDecimal> _2 = Internal.createParameter("_2", org.jooq.impl.SQLDataType.NUMERIC, false, true);

    /**
     * Create a new routine call instance
     */
    public AeDistributeEnum() {
        super("ae_distribute_enum", Public.PUBLIC, org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(BigDecimal value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<BigDecimal> field) {
        setField(_2, field);
    }
}
