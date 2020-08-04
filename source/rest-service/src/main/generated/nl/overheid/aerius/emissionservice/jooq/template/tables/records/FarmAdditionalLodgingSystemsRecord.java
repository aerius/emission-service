/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.FarmAdditionalLodgingSystems;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Additionele staltechnieken. Dit zijn staltechnieken die zorgen voor extra 
 * emissies en die gestapeld kunnen worden op een stalsysteem (farm_lodging_type).
 * 
 * Deze additionele staltechnieken zijn afgeleid uit de RAV-code lijst.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FarmAdditionalLodgingSystemsRecord extends UpdatableRecordImpl<FarmAdditionalLodgingSystemsRecord> implements Record6<Integer, Integer, String, String, String, Boolean> {

    private static final long serialVersionUID = -1506660731;

    /**
     * Setter for <code>template.farm_additional_lodging_systems.farm_additional_lodging_system_id</code>.
     */
    public void setFarmAdditionalLodgingSystemId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.farm_additional_lodging_systems.farm_additional_lodging_system_id</code>.
     */
    public Integer getFarmAdditionalLodgingSystemId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.farm_additional_lodging_systems.farm_animal_category_id</code>.
     */
    public void setFarmAnimalCategoryId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.farm_additional_lodging_systems.farm_animal_category_id</code>.
     */
    public Integer getFarmAnimalCategoryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>template.farm_additional_lodging_systems.code</code>.
     */
    public void setCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.farm_additional_lodging_systems.code</code>.
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.farm_additional_lodging_systems.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.farm_additional_lodging_systems.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>template.farm_additional_lodging_systems.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>template.farm_additional_lodging_systems.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>template.farm_additional_lodging_systems.scrubber</code>.
     */
    public void setScrubber(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>template.farm_additional_lodging_systems.scrubber</code>.
     */
    public Boolean getScrubber() {
        return (Boolean) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, String, String, String, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, String, String, String, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FarmAdditionalLodgingSystems.FARM_ADDITIONAL_LODGING_SYSTEMS.FARM_ADDITIONAL_LODGING_SYSTEM_ID;
    }

    @Override
    public Field<Integer> field2() {
        return FarmAdditionalLodgingSystems.FARM_ADDITIONAL_LODGING_SYSTEMS.FARM_ANIMAL_CATEGORY_ID;
    }

    @Override
    public Field<String> field3() {
        return FarmAdditionalLodgingSystems.FARM_ADDITIONAL_LODGING_SYSTEMS.CODE;
    }

    @Override
    public Field<String> field4() {
        return FarmAdditionalLodgingSystems.FARM_ADDITIONAL_LODGING_SYSTEMS.NAME;
    }

    @Override
    public Field<String> field5() {
        return FarmAdditionalLodgingSystems.FARM_ADDITIONAL_LODGING_SYSTEMS.DESCRIPTION;
    }

    @Override
    public Field<Boolean> field6() {
        return FarmAdditionalLodgingSystems.FARM_ADDITIONAL_LODGING_SYSTEMS.SCRUBBER;
    }

    @Override
    public Integer component1() {
        return getFarmAdditionalLodgingSystemId();
    }

    @Override
    public Integer component2() {
        return getFarmAnimalCategoryId();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public String component5() {
        return getDescription();
    }

    @Override
    public Boolean component6() {
        return getScrubber();
    }

    @Override
    public Integer value1() {
        return getFarmAdditionalLodgingSystemId();
    }

    @Override
    public Integer value2() {
        return getFarmAnimalCategoryId();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public String value5() {
        return getDescription();
    }

    @Override
    public Boolean value6() {
        return getScrubber();
    }

    @Override
    public FarmAdditionalLodgingSystemsRecord value1(Integer value) {
        setFarmAdditionalLodgingSystemId(value);
        return this;
    }

    @Override
    public FarmAdditionalLodgingSystemsRecord value2(Integer value) {
        setFarmAnimalCategoryId(value);
        return this;
    }

    @Override
    public FarmAdditionalLodgingSystemsRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FarmAdditionalLodgingSystemsRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public FarmAdditionalLodgingSystemsRecord value5(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FarmAdditionalLodgingSystemsRecord value6(Boolean value) {
        setScrubber(value);
        return this;
    }

    @Override
    public FarmAdditionalLodgingSystemsRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FarmAdditionalLodgingSystemsRecord
     */
    public FarmAdditionalLodgingSystemsRecord() {
        super(FarmAdditionalLodgingSystems.FARM_ADDITIONAL_LODGING_SYSTEMS);
    }

    /**
     * Create a detached, initialised FarmAdditionalLodgingSystemsRecord
     */
    public FarmAdditionalLodgingSystemsRecord(Integer farmAdditionalLodgingSystemId, Integer farmAnimalCategoryId, String code, String name, String description, Boolean scrubber) {
        super(FarmAdditionalLodgingSystems.FARM_ADDITIONAL_LODGING_SYSTEMS);

        set(0, farmAdditionalLodgingSystemId);
        set(1, farmAnimalCategoryId);
        set(2, code);
        set(3, name);
        set(4, description);
        set(5, scrubber);
    }
}
