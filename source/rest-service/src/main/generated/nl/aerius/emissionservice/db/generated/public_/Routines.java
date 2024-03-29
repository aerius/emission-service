/*
 * This file is generated by jOOQ.
 */
package nl.aerius.emissionservice.db.generated.public_;


import java.math.BigDecimal;

import nl.aerius.emissionservice.db.generated.public_.routines.AeArrayIndex;
import nl.aerius.emissionservice.db.generated.public_.routines.AeArrayToIndex;
import nl.aerius.emissionservice.db.generated.public_.routines.AeConstant;
import nl.aerius.emissionservice.db.generated.public_.routines.AeDistributeEnum;
import nl.aerius.emissionservice.db.generated.public_.routines.AeDistributeEnumSfunc;
import nl.aerius.emissionservice.db.generated.public_.routines.AeEnumByIndex;
import nl.aerius.emissionservice.db.generated.public_.routines.AeEnumToIndex;
import nl.aerius.emissionservice.db.generated.public_.routines.AeGetSrid;
import nl.aerius.emissionservice.db.generated.public_.routines.AeLinearInterpolate1;
import nl.aerius.emissionservice.db.generated.public_.routines.AeLinearInterpolate2;
import nl.aerius.emissionservice.db.generated.public_.routines.AeMaxWithKey;
import nl.aerius.emissionservice.db.generated.public_.routines.AeMaxWithKeyFfunc;
import nl.aerius.emissionservice.db.generated.public_.routines.AeMaxWithKeySfunc;
import nl.aerius.emissionservice.db.generated.public_.routines.AeMedian;
import nl.aerius.emissionservice.db.generated.public_.routines.AePercentile;
import nl.aerius.emissionservice.db.generated.public_.routines.AePercentileSortedArray;
import nl.aerius.emissionservice.db.generated.public_.routines.AeRaiseNotice;
import nl.aerius.emissionservice.db.generated.public_.routines.AeWeightedAvg;
import nl.aerius.emissionservice.db.generated.public_.routines.AeWeightedAvgFfunc;
import nl.aerius.emissionservice.db.generated.public_.routines.AeWeightedAvgSfunc;
import nl.aerius.emissionservice.db.generated.public_.udt.records.AeKeyValueRsRecord;

import org.jooq.AggregateFunction;
import org.jooq.Configuration;
import org.jooq.Field;


/**
 * Convenience access to all stored procedures and functions in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Integer aeArrayIndex(
          Configuration configuration
        , Object[] __1
        , Object __2
    ) {
        AeArrayIndex f = new AeArrayIndex();
        f.set__1(__1);
        f.set__2(__2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Field<Integer> aeArrayIndex(
          Object[] __1
        , Object __2
    ) {
        AeArrayIndex f = new AeArrayIndex();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Field<Integer> aeArrayIndex(
          Field<Object[]> __1
        , Field<Object> __2
    ) {
        AeArrayIndex f = new AeArrayIndex();
        f.set__1(__1);
        f.set__2(__2);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Integer aeArrayToIndex(
          Configuration configuration
        , Object[] anyarray
        , Object anyelement
    ) {
        AeArrayToIndex f = new AeArrayToIndex();
        f.setAnyarray(anyarray);
        f.setAnyelement(anyelement);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Field<Integer> aeArrayToIndex(
          Object[] anyarray
        , Object anyelement
    ) {
        AeArrayToIndex f = new AeArrayToIndex();
        f.setAnyarray(anyarray);
        f.setAnyelement(anyelement);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Field<Integer> aeArrayToIndex(
          Field<Object[]> anyarray
        , Field<Object> anyelement
    ) {
        AeArrayToIndex f = new AeArrayToIndex();
        f.setAnyarray(anyarray);
        f.setAnyelement(anyelement);

        return f.asField();
    }

    /**
     * Call <code>public.ae_constant</code>
     */
    public static String aeConstant(
          Configuration configuration
        , String constantKey
    ) {
        AeConstant f = new AeConstant();
        f.setConstantKey(constantKey);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.ae_constant</code> as a field.
     */
    public static Field<String> aeConstant(
          String constantKey
    ) {
        AeConstant f = new AeConstant();
        f.setConstantKey(constantKey);

        return f.asField();
    }

    /**
     * Get <code>public.ae_constant</code> as a field.
     */
    public static Field<String> aeConstant(
          Field<String> constantKey
    ) {
        AeConstant f = new AeConstant();
        f.setConstantKey(constantKey);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static AggregateFunction<BigDecimal[]> aeDistributeEnum(
          Object __1
        , BigDecimal __2
    ) {
        AeDistributeEnum f = new AeDistributeEnum();
        f.set__1(__1);
        f.set__2(__2);

        return f.asAggregateFunction();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static AggregateFunction<BigDecimal[]> aeDistributeEnum(
          Field<Object> __1
        , Field<BigDecimal> __2
    ) {
        AeDistributeEnum f = new AeDistributeEnum();
        f.set__1(__1);
        f.set__2(__2);

        return f.asAggregateFunction();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static BigDecimal[] aeDistributeEnumSfunc(
          Configuration configuration
        , BigDecimal[] state
        , Object key
        , BigDecimal weight
    ) {
        AeDistributeEnumSfunc f = new AeDistributeEnumSfunc();
        f.setState(state);
        f.setKey(key);
        f.setWeight(weight);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Field<BigDecimal[]> aeDistributeEnumSfunc(
          BigDecimal[] state
        , Object key
        , BigDecimal weight
    ) {
        AeDistributeEnumSfunc f = new AeDistributeEnumSfunc();
        f.setState(state);
        f.setKey(key);
        f.setWeight(weight);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Field<BigDecimal[]> aeDistributeEnumSfunc(
          Field<BigDecimal[]> state
        , Field<Object> key
        , Field<BigDecimal> weight
    ) {
        AeDistributeEnumSfunc f = new AeDistributeEnumSfunc();
        f.setState(state);
        f.setKey(key);
        f.setWeight(weight);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static Object aeEnumByIndex(
          Configuration configuration
        , Object anyenum
        , Integer index
    ) {
        AeEnumByIndex f = new AeEnumByIndex();
        f.setAnyenum(anyenum);
        f.setIndex(index);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static Field<Object> aeEnumByIndex(
          Object anyenum
        , Integer index
    ) {
        AeEnumByIndex f = new AeEnumByIndex();
        f.setAnyenum(anyenum);
        f.setIndex(index);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static Field<Object> aeEnumByIndex(
          Field<Object> anyenum
        , Field<Integer> index
    ) {
        AeEnumByIndex f = new AeEnumByIndex();
        f.setAnyenum(anyenum);
        f.setIndex(index);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Integer aeEnumToIndex(
          Configuration configuration
        , Object anyenum
    ) {
        AeEnumToIndex f = new AeEnumToIndex();
        f.setAnyenum(anyenum);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Field<Integer> aeEnumToIndex(
          Object anyenum
    ) {
        AeEnumToIndex f = new AeEnumToIndex();
        f.setAnyenum(anyenum);

        return f.asField();
    }

    /**
     * @deprecated Unknown data type. Parameter type or return type is unknown.
     * If this is a qualified, user-defined type, it may have been excluded from
     * code generation. If this is a built-in type, you can define an explicit
     * {@link org.jooq.Binding} to specify how this type should be handled.
     * Deprecation can be turned off using {@literal
     * <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public static Field<Integer> aeEnumToIndex(
          Field<Object> anyenum
    ) {
        AeEnumToIndex f = new AeEnumToIndex();
        f.setAnyenum(anyenum);

        return f.asField();
    }

    /**
     * Call <code>public.ae_get_srid</code>
     */
    public static Integer aeGetSrid(
          Configuration configuration
    ) {
        AeGetSrid f = new AeGetSrid();

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.ae_get_srid</code> as a field.
     */
    public static Field<Integer> aeGetSrid() {
        AeGetSrid f = new AeGetSrid();

        return f.asField();
    }

    /**
     * Call <code>public.ae_linear_interpolate</code>
     */
    public static Double aeLinearInterpolate1(
          Configuration configuration
        , Double xb
        , Double xe
        , Double yb
        , Double ye
        , Double xi
    ) {
        AeLinearInterpolate1 f = new AeLinearInterpolate1();
        f.setXb(xb);
        f.setXe(xe);
        f.setYb(yb);
        f.setYe(ye);
        f.setXi(xi);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.ae_linear_interpolate</code> as a field.
     */
    public static Field<Double> aeLinearInterpolate1(
          Double xb
        , Double xe
        , Double yb
        , Double ye
        , Double xi
    ) {
        AeLinearInterpolate1 f = new AeLinearInterpolate1();
        f.setXb(xb);
        f.setXe(xe);
        f.setYb(yb);
        f.setYe(ye);
        f.setXi(xi);

        return f.asField();
    }

    /**
     * Get <code>public.ae_linear_interpolate</code> as a field.
     */
    public static Field<Double> aeLinearInterpolate1(
          Field<Double> xb
        , Field<Double> xe
        , Field<Double> yb
        , Field<Double> ye
        , Field<Double> xi
    ) {
        AeLinearInterpolate1 f = new AeLinearInterpolate1();
        f.setXb(xb);
        f.setXe(xe);
        f.setYb(yb);
        f.setYe(ye);
        f.setXi(xi);

        return f.asField();
    }

    /**
     * Call <code>public.ae_linear_interpolate</code>
     */
    public static Float aeLinearInterpolate2(
          Configuration configuration
        , Integer xb
        , Integer xe
        , Float yb
        , Float ye
        , Integer xi
    ) {
        AeLinearInterpolate2 f = new AeLinearInterpolate2();
        f.setXb(xb);
        f.setXe(xe);
        f.setYb(yb);
        f.setYe(ye);
        f.setXi(xi);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.ae_linear_interpolate</code> as a field.
     */
    public static Field<Float> aeLinearInterpolate2(
          Integer xb
        , Integer xe
        , Float yb
        , Float ye
        , Integer xi
    ) {
        AeLinearInterpolate2 f = new AeLinearInterpolate2();
        f.setXb(xb);
        f.setXe(xe);
        f.setYb(yb);
        f.setYe(ye);
        f.setXi(xi);

        return f.asField();
    }

    /**
     * Get <code>public.ae_linear_interpolate</code> as a field.
     */
    public static Field<Float> aeLinearInterpolate2(
          Field<Integer> xb
        , Field<Integer> xe
        , Field<Float> yb
        , Field<Float> ye
        , Field<Integer> xi
    ) {
        AeLinearInterpolate2 f = new AeLinearInterpolate2();
        f.setXb(xb);
        f.setXe(xe);
        f.setYb(yb);
        f.setYe(ye);
        f.setXi(xi);

        return f.asField();
    }

    /**
     * Get <code>public.ae_max_with_key</code> as a field.
     */
    public static AggregateFunction<AeKeyValueRsRecord> aeMaxWithKey(
          BigDecimal __1
        , BigDecimal __2
    ) {
        AeMaxWithKey f = new AeMaxWithKey();
        f.set__1(__1);
        f.set__2(__2);

        return f.asAggregateFunction();
    }

    /**
     * Get <code>public.ae_max_with_key</code> as a field.
     */
    public static AggregateFunction<AeKeyValueRsRecord> aeMaxWithKey(
          Field<BigDecimal> __1
        , Field<BigDecimal> __2
    ) {
        AeMaxWithKey f = new AeMaxWithKey();
        f.set__1(__1);
        f.set__2(__2);

        return f.asAggregateFunction();
    }

    /**
     * Call <code>public.ae_max_with_key_ffunc</code>
     */
    public static AeKeyValueRsRecord aeMaxWithKeyFfunc(
          Configuration configuration
        , BigDecimal[] state
    ) {
        AeMaxWithKeyFfunc f = new AeMaxWithKeyFfunc();
        f.setState(state);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.ae_max_with_key_ffunc</code> as a field.
     */
    public static Field<AeKeyValueRsRecord> aeMaxWithKeyFfunc(
          BigDecimal[] state
    ) {
        AeMaxWithKeyFfunc f = new AeMaxWithKeyFfunc();
        f.setState(state);

        return f.asField();
    }

    /**
     * Get <code>public.ae_max_with_key_ffunc</code> as a field.
     */
    public static Field<AeKeyValueRsRecord> aeMaxWithKeyFfunc(
          Field<BigDecimal[]> state
    ) {
        AeMaxWithKeyFfunc f = new AeMaxWithKeyFfunc();
        f.setState(state);

        return f.asField();
    }

    /**
     * Call <code>public.ae_max_with_key_sfunc</code>
     */
    public static BigDecimal[] aeMaxWithKeySfunc(
          Configuration configuration
        , BigDecimal[] state
        , BigDecimal e1
        , BigDecimal e2
    ) {
        AeMaxWithKeySfunc f = new AeMaxWithKeySfunc();
        f.setState(state);
        f.setE1(e1);
        f.setE2(e2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.ae_max_with_key_sfunc</code> as a field.
     */
    public static Field<BigDecimal[]> aeMaxWithKeySfunc(
          BigDecimal[] state
        , BigDecimal e1
        , BigDecimal e2
    ) {
        AeMaxWithKeySfunc f = new AeMaxWithKeySfunc();
        f.setState(state);
        f.setE1(e1);
        f.setE2(e2);

        return f.asField();
    }

    /**
     * Get <code>public.ae_max_with_key_sfunc</code> as a field.
     */
    public static Field<BigDecimal[]> aeMaxWithKeySfunc(
          Field<BigDecimal[]> state
        , Field<BigDecimal> e1
        , Field<BigDecimal> e2
    ) {
        AeMaxWithKeySfunc f = new AeMaxWithKeySfunc();
        f.setState(state);
        f.setE1(e1);
        f.setE2(e2);

        return f.asField();
    }

    /**
     * Call <code>public.ae_median</code>
     */
    public static BigDecimal aeMedian(
          Configuration configuration
        , BigDecimal[] unsortedArray
    ) {
        AeMedian f = new AeMedian();
        f.setUnsortedArray(unsortedArray);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.ae_median</code> as a field.
     */
    public static Field<BigDecimal> aeMedian(
          BigDecimal[] unsortedArray
    ) {
        AeMedian f = new AeMedian();
        f.setUnsortedArray(unsortedArray);

        return f.asField();
    }

    /**
     * Get <code>public.ae_median</code> as a field.
     */
    public static Field<BigDecimal> aeMedian(
          Field<BigDecimal[]> unsortedArray
    ) {
        AeMedian f = new AeMedian();
        f.setUnsortedArray(unsortedArray);

        return f.asField();
    }

    /**
     * Call <code>public.ae_percentile</code>
     */
    public static BigDecimal aePercentile(
          Configuration configuration
        , BigDecimal[] unsortedArray
        , Integer percentile
    ) {
        AePercentile f = new AePercentile();
        f.setUnsortedArray(unsortedArray);
        f.setPercentile(percentile);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.ae_percentile</code> as a field.
     */
    public static Field<BigDecimal> aePercentile(
          BigDecimal[] unsortedArray
        , Integer percentile
    ) {
        AePercentile f = new AePercentile();
        f.setUnsortedArray(unsortedArray);
        f.setPercentile(percentile);

        return f.asField();
    }

    /**
     * Get <code>public.ae_percentile</code> as a field.
     */
    public static Field<BigDecimal> aePercentile(
          Field<BigDecimal[]> unsortedArray
        , Field<Integer> percentile
    ) {
        AePercentile f = new AePercentile();
        f.setUnsortedArray(unsortedArray);
        f.setPercentile(percentile);

        return f.asField();
    }

    /**
     * Call <code>public.ae_percentile_sorted_array</code>
     */
    public static BigDecimal aePercentileSortedArray(
          Configuration configuration
        , BigDecimal[] sortedArray
        , Integer percentile
    ) {
        AePercentileSortedArray f = new AePercentileSortedArray();
        f.setSortedArray(sortedArray);
        f.setPercentile(percentile);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.ae_percentile_sorted_array</code> as a field.
     */
    public static Field<BigDecimal> aePercentileSortedArray(
          BigDecimal[] sortedArray
        , Integer percentile
    ) {
        AePercentileSortedArray f = new AePercentileSortedArray();
        f.setSortedArray(sortedArray);
        f.setPercentile(percentile);

        return f.asField();
    }

    /**
     * Get <code>public.ae_percentile_sorted_array</code> as a field.
     */
    public static Field<BigDecimal> aePercentileSortedArray(
          Field<BigDecimal[]> sortedArray
        , Field<Integer> percentile
    ) {
        AePercentileSortedArray f = new AePercentileSortedArray();
        f.setSortedArray(sortedArray);
        f.setPercentile(percentile);

        return f.asField();
    }

    /**
     * Call <code>public.ae_raise_notice</code>
     */
    public static void aeRaiseNotice(
          Configuration configuration
        , String message
    ) {
        AeRaiseNotice p = new AeRaiseNotice();
        p.setMessage(message);

        p.execute(configuration);
    }

    /**
     * Get <code>public.ae_weighted_avg</code> as a field.
     */
    public static AggregateFunction<BigDecimal> aeWeightedAvg(
          BigDecimal __1
        , BigDecimal __2
    ) {
        AeWeightedAvg f = new AeWeightedAvg();
        f.set__1(__1);
        f.set__2(__2);

        return f.asAggregateFunction();
    }

    /**
     * Get <code>public.ae_weighted_avg</code> as a field.
     */
    public static AggregateFunction<BigDecimal> aeWeightedAvg(
          Field<BigDecimal> __1
        , Field<BigDecimal> __2
    ) {
        AeWeightedAvg f = new AeWeightedAvg();
        f.set__1(__1);
        f.set__2(__2);

        return f.asAggregateFunction();
    }

    /**
     * Call <code>public.ae_weighted_avg_ffunc</code>
     */
    public static BigDecimal aeWeightedAvgFfunc(
          Configuration configuration
        , BigDecimal[] state
    ) {
        AeWeightedAvgFfunc f = new AeWeightedAvgFfunc();
        f.setState(state);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.ae_weighted_avg_ffunc</code> as a field.
     */
    public static Field<BigDecimal> aeWeightedAvgFfunc(
          BigDecimal[] state
    ) {
        AeWeightedAvgFfunc f = new AeWeightedAvgFfunc();
        f.setState(state);

        return f.asField();
    }

    /**
     * Get <code>public.ae_weighted_avg_ffunc</code> as a field.
     */
    public static Field<BigDecimal> aeWeightedAvgFfunc(
          Field<BigDecimal[]> state
    ) {
        AeWeightedAvgFfunc f = new AeWeightedAvgFfunc();
        f.setState(state);

        return f.asField();
    }

    /**
     * Call <code>public.ae_weighted_avg_sfunc</code>
     */
    public static BigDecimal[] aeWeightedAvgSfunc(
          Configuration configuration
        , BigDecimal[] state
        , BigDecimal value
        , BigDecimal weight
    ) {
        AeWeightedAvgSfunc f = new AeWeightedAvgSfunc();
        f.setState(state);
        f.setValue(value);
        f.setWeight(weight);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.ae_weighted_avg_sfunc</code> as a field.
     */
    public static Field<BigDecimal[]> aeWeightedAvgSfunc(
          BigDecimal[] state
        , BigDecimal value
        , BigDecimal weight
    ) {
        AeWeightedAvgSfunc f = new AeWeightedAvgSfunc();
        f.setState(state);
        f.setValue(value);
        f.setWeight(weight);

        return f.asField();
    }

    /**
     * Get <code>public.ae_weighted_avg_sfunc</code> as a field.
     */
    public static Field<BigDecimal[]> aeWeightedAvgSfunc(
          Field<BigDecimal[]> state
        , Field<BigDecimal> value
        , Field<BigDecimal> weight
    ) {
        AeWeightedAvgSfunc f = new AeWeightedAvgSfunc();
        f.setState(state);
        f.setValue(value);
        f.setWeight(weight);

        return f.asField();
    }
}
