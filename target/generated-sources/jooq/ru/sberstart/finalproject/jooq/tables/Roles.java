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
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import ru.sberstart.finalproject.jooq.Keys;
import ru.sberstart.finalproject.jooq.Public;
import ru.sberstart.finalproject.jooq.tables.records.RolesRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Roles extends TableImpl<RolesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC.ROLES</code>
     */
    public static final Roles ROLES = new Roles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RolesRecord> getRecordType() {
        return RolesRecord.class;
    }

    /**
     * The column <code>PUBLIC.ROLES.ID</code>.
     */
    public final TableField<RolesRecord, UUID> ID = createField(DSL.name("ID"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field(DSL.raw("RANDOM_UUID()"), SQLDataType.UUID)), this, "");

    /**
     * The column <code>PUBLIC.ROLES.ROLE_NAME</code>.
     */
    public final TableField<RolesRecord, String> ROLE_NAME = createField(DSL.name("ROLE_NAME"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    private Roles(Name alias, Table<RolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Roles(Name alias, Table<RolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>PUBLIC.ROLES</code> table reference
     */
    public Roles(String alias) {
        this(DSL.name(alias), ROLES);
    }

    /**
     * Create an aliased <code>PUBLIC.ROLES</code> table reference
     */
    public Roles(Name alias) {
        this(alias, ROLES);
    }

    /**
     * Create a <code>PUBLIC.ROLES</code> table reference
     */
    public Roles() {
        this(DSL.name("ROLES"), null);
    }

    public <O extends Record> Roles(Table<O> child, ForeignKey<O, RolesRecord> key) {
        super(child, key, ROLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<RolesRecord> getPrimaryKey() {
        return Keys.PK_ROLES;
    }

    @Override
    public List<UniqueKey<RolesRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.CONSTRAINT_4A);
    }

    @Override
    public Roles as(String alias) {
        return new Roles(DSL.name(alias), this);
    }

    @Override
    public Roles as(Name alias) {
        return new Roles(alias, this);
    }

    @Override
    public Roles as(Table<?> alias) {
        return new Roles(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(String name) {
        return new Roles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(Name name) {
        return new Roles(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(Table<?> name) {
        return new Roles(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super UUID, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super UUID, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
