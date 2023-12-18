/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.public_.routines;


import java.math.BigDecimal;

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
public class AePercentile extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>public.ae_percentile.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.NUMERIC, false, false);

    /**
     * The parameter <code>public.ae_percentile.unsorted_array</code>.
     */
    public static final Parameter<BigDecimal[]> UNSORTED_ARRAY = Internal.createParameter("unsorted_array", SQLDataType.NUMERIC.getArrayDataType(), false, false);

    /**
     * The parameter <code>public.ae_percentile.percentile</code>.
     */
    public static final Parameter<Integer> PERCENTILE = Internal.createParameter("percentile", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public AePercentile() {
        super("ae_percentile", Public.PUBLIC, SQLDataType.NUMERIC);

        setReturnParameter(RETURN_VALUE);
        addInParameter(UNSORTED_ARRAY);
        addInParameter(PERCENTILE);
    }

    /**
     * Set the <code>unsorted_array</code> parameter IN value to the routine
     */
    public void setUnsortedArray(BigDecimal[] value) {
        setValue(UNSORTED_ARRAY, value);
    }

    /**
     * Set the <code>unsorted_array</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setUnsortedArray(Field<BigDecimal[]> field) {
        setField(UNSORTED_ARRAY, field);
    }

    /**
     * Set the <code>percentile</code> parameter IN value to the routine
     */
    public void setPercentile(Integer value) {
        setValue(PERCENTILE, value);
    }

    /**
     * Set the <code>percentile</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setPercentile(Field<Integer> field) {
        setField(PERCENTILE, field);
    }
}