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
public class AeLinearInterpolate2 extends AbstractRoutine<Float> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>public.ae_linear_interpolate.RETURN_VALUE</code>.
     */
    public static final Parameter<Float> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.REAL, false, false);

    /**
     * The parameter <code>public.ae_linear_interpolate.xb</code>.
     */
    public static final Parameter<Integer> XB = Internal.createParameter("xb", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.ae_linear_interpolate.xe</code>.
     */
    public static final Parameter<Integer> XE = Internal.createParameter("xe", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.ae_linear_interpolate.yb</code>.
     */
    public static final Parameter<Float> YB = Internal.createParameter("yb", SQLDataType.REAL, false, false);

    /**
     * The parameter <code>public.ae_linear_interpolate.ye</code>.
     */
    public static final Parameter<Float> YE = Internal.createParameter("ye", SQLDataType.REAL, false, false);

    /**
     * The parameter <code>public.ae_linear_interpolate.xi</code>.
     */
    public static final Parameter<Integer> XI = Internal.createParameter("xi", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public AeLinearInterpolate2() {
        super("ae_linear_interpolate", Public.PUBLIC, SQLDataType.REAL);

        setReturnParameter(RETURN_VALUE);
        addInParameter(XB);
        addInParameter(XE);
        addInParameter(YB);
        addInParameter(YE);
        addInParameter(XI);
        setOverloaded(true);
    }

    /**
     * Set the <code>xb</code> parameter IN value to the routine
     */
    public void setXb(Integer value) {
        setValue(XB, value);
    }

    /**
     * Set the <code>xb</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setXb(Field<Integer> field) {
        setField(XB, field);
    }

    /**
     * Set the <code>xe</code> parameter IN value to the routine
     */
    public void setXe(Integer value) {
        setValue(XE, value);
    }

    /**
     * Set the <code>xe</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setXe(Field<Integer> field) {
        setField(XE, field);
    }

    /**
     * Set the <code>yb</code> parameter IN value to the routine
     */
    public void setYb(Float value) {
        setValue(YB, value);
    }

    /**
     * Set the <code>yb</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setYb(Field<Float> field) {
        setField(YB, field);
    }

    /**
     * Set the <code>ye</code> parameter IN value to the routine
     */
    public void setYe(Float value) {
        setValue(YE, value);
    }

    /**
     * Set the <code>ye</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setYe(Field<Float> field) {
        setField(YE, field);
    }

    /**
     * Set the <code>xi</code> parameter IN value to the routine
     */
    public void setXi(Integer value) {
        setValue(XI, value);
    }

    /**
     * Set the <code>xi</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setXi(Field<Integer> field) {
        setField(XI, field);
    }
}
