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
public class AeWeightedAvgSfunc extends AbstractRoutine<BigDecimal[]> {

    private static final long serialVersionUID = -852738672;

    /**
     * The parameter <code>public.ae_weighted_avg_sfunc.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType(), false, false);

    /**
     * The parameter <code>public.ae_weighted_avg_sfunc.state</code>.
     */
    public static final Parameter<BigDecimal[]> STATE = Internal.createParameter("state", org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType(), false, false);

    /**
     * The parameter <code>public.ae_weighted_avg_sfunc.value</code>.
     */
    public static final Parameter<BigDecimal> VALUE = Internal.createParameter("value", org.jooq.impl.SQLDataType.NUMERIC, false, false);

    /**
     * The parameter <code>public.ae_weighted_avg_sfunc.weight</code>.
     */
    public static final Parameter<BigDecimal> WEIGHT = Internal.createParameter("weight", org.jooq.impl.SQLDataType.NUMERIC, false, false);

    /**
     * Create a new routine call instance
     */
    public AeWeightedAvgSfunc() {
        super("ae_weighted_avg_sfunc", Public.PUBLIC, org.jooq.impl.SQLDataType.NUMERIC.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(STATE);
        addInParameter(VALUE);
        addInParameter(WEIGHT);
    }

    /**
     * Set the <code>state</code> parameter IN value to the routine
     */
    public void setState(BigDecimal[] value) {
        setValue(STATE, value);
    }

    /**
     * Set the <code>state</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setState(Field<BigDecimal[]> field) {
        setField(STATE, field);
    }

    /**
     * Set the <code>value</code> parameter IN value to the routine
     */
    public void setValue(BigDecimal value) {
        setValue(VALUE, value);
    }

    /**
     * Set the <code>value</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setValue(Field<BigDecimal> field) {
        setField(VALUE, field);
    }

    /**
     * Set the <code>weight</code> parameter IN value to the routine
     */
    public void setWeight(BigDecimal value) {
        setValue(WEIGHT, value);
    }

    /**
     * Set the <code>weight</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setWeight(Field<BigDecimal> field) {
        setField(WEIGHT, field);
    }
}
