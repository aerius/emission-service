/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.public_.routines;


import nl.aerius.emissionservice.db.generated.public_.Public;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AeRaiseNotice extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>public.ae_raise_notice.message</code>.
     */
    public static final Parameter<String> MESSAGE = Internal.createParameter("message", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public AeRaiseNotice() {
        super("ae_raise_notice", Public.PUBLIC);

        addInParameter(MESSAGE);
    }

    /**
     * Set the <code>message</code> parameter IN value to the routine
     */
    public void setMessage(String value) {
        setValue(MESSAGE, value);
    }
}
