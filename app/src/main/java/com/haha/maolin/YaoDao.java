package com.haha.maolin;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import mao.test.greendaodemo_my.bean.Yao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "YAO".
*/
public class YaoDao extends AbstractDao<Yao, Long> {

    public static final String TABLENAME = "YAO";

    /**
     * Properties of entity Yao.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Y_id = new Property(0, Long.class, "y_id", true, "yao_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Price = new Property(2, long.class, "price", false, "PRICE");
        public final static Property Number = new Property(3, String.class, "number", false, "NUMBER");
    }


    public YaoDao(DaoConfig config) {
        super(config);
    }
    
    public YaoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"YAO\" (" + //
                "\"yao_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: y_id
                "\"NAME\" TEXT," + // 1: name
                "\"PRICE\" INTEGER NOT NULL ," + // 2: price
                "\"NUMBER\" TEXT);"); // 3: number
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"YAO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Yao entity) {
        stmt.clearBindings();
 
        Long y_id = entity.getY_id();
        if (y_id != null) {
            stmt.bindLong(1, y_id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getPrice());
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(4, number);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Yao entity) {
        stmt.clearBindings();
 
        Long y_id = entity.getY_id();
        if (y_id != null) {
            stmt.bindLong(1, y_id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindLong(3, entity.getPrice());
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(4, number);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Yao readEntity(Cursor cursor, int offset) {
        Yao entity = new Yao( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // y_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.getLong(offset + 2), // price
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // number
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Yao entity, int offset) {
        entity.setY_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPrice(cursor.getLong(offset + 2));
        entity.setNumber(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Yao entity, long rowId) {
        entity.setY_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Yao entity) {
        if(entity != null) {
            return entity.getY_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Yao entity) {
        return entity.getY_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
