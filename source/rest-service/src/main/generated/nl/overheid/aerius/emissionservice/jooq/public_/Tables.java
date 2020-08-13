/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_;


import nl.overheid.aerius.emissionservice.jooq.public_.tables.Constants;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.Datasets;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.Substances;


/**
 * Convenience access to all tables in public
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * Tabel voor de database constanten.

@file source/database/src/main/sql/essentials/00-init/03-constants.sql
     */
    public static final Constants CONSTANTS = Constants.CONSTANTS;

    /**
     * De verschillende datasets die beschikbaar zijn.
De data voor elke dataset bevindt zich in een eigen database schema.

@file source/database/src/main/sql/datasets/02-tables.sql
     */
    public static final Datasets DATASETS = Datasets.DATASETS;

    /**
     * Stoffen

@file source/database/src/main/sql/substances/02-tables.sql
     */
    public static final Substances SUBSTANCES = Substances.SUBSTANCES;
}
