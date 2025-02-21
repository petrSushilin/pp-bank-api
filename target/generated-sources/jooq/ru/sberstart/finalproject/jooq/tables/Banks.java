/*
 * This file is generated by jOOQ.
 */
package ru.sberstart.finalproject.jooq.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import ru.sberstart.finalproject.jooq.Indexes;
import ru.sberstart.finalproject.jooq.Keys;
import ru.sberstart.finalproject.jooq.Public;
import ru.sberstart.finalproject.jooq.tables.records.BanksRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Banks extends TableImpl<BanksRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC.BANKS</code>
     */
    public static final Banks BANKS = new Banks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BanksRecord> getRecordType() {
        return BanksRecord.class;
    }

    /**
     * The column <code>PUBLIC.BANKS.ID</code>.
     */
    public final TableField<BanksRecord, UUID> ID = createField(DSL.name("ID"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field(DSL.raw("RANDOM_UUID()"), SQLDataType.UUID)), this, "");

    /**
     * The column <code>PUBLIC.BANKS.NAME</code>.
     */
    public final TableField<BanksRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BANKS.IDENTITY_NUMBER</code>.
     */
    public final TableField<BanksRecord, String> IDENTITY_NUMBER = createField(DSL.name("IDENTITY_NUMBER"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    private Banks(Name alias, Table<BanksRecord> aliased) {
        this(alias, aliased, null);
    }

    private Banks(Name alias, Table<BanksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>PUBLIC.BANKS</code> table reference
     */
    public Banks(String alias) {
        this(DSL.name(alias), BANKS);
    }

    /**
     * Create an aliased <code>PUBLIC.BANKS</code> table reference
     */
    public Banks(Name alias) {
        this(alias, BANKS);
    }

    /**
     * Create a <code>PUBLIC.BANKS</code> table reference
     */
    public Banks() {
        this(DSL.name("BANKS"), null);
    }

    public <O extends Record> Banks(Table<O> child, ForeignKey<O, BanksRecord> key) {
        super(child, key, BANKS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_IDENTITY_NUMBER);
    }

    @Override
    public UniqueKey<BanksRecord> getPrimaryKey() {
        return Keys.PK_BANKS;
    }

    @Override
    public List<UniqueKey<BanksRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.CONSTRAINT_3);
    }

    @Override
    public Banks as(String alias) {
        return new Banks(DSL.name(alias), this);
    }

    @Override
    public Banks as(Name alias) {
        return new Banks(alias, this);
    }

    @Override
    public Banks as(Table<?> alias) {
        return new Banks(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Banks rename(String name) {
        return new Banks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Banks rename(Name name) {
        return new Banks(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Banks rename(Table<?> name) {
        return new Banks(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UUID, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super UUID, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super UUID, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
