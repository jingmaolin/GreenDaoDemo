package com.haha.maolin;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import mao.test.greendaodemo_my.bean.Detail;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "detail".
*/
public class DetailDao extends AbstractDao<Detail, Long> {

    public static final String TABLENAME = "detail";

    /**
     * Properties of entity Detail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property D_id = new Property(0, Long.class, "d_id", true, "detail_id");
        public final static Property Contain = new Property(1, String.class, "contain", false, "CONTAIN");
        public final static Property Location = new Property(2, String.class, "location", false, "LOCATION");
        public final static Property Ban = new Property(3, String.class, "ban", false, "BAN");
    }


    public DetailDao(DaoConfig config) {
        super(config);
    }
    
    public DetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"detail\" (" + //
                "\"detail_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: d_id
                "\"CONTAIN\" TEXT," + // 1: contain
                "\"LOCATION\" TEXT," + // 2: location
                "\"BAN\" TEXT);"); // 3: ban
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"detail\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Detail entity) {
        stmt.clearBindings();
 
        Long d_id = entity.getD_id();
        if (d_id != null) {
            stmt.bindLong(1, d_id);
        }
 
        String contain = entity.getContain();
        if (contain != null) {
            stmt.bindString(2, contain);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(3, location);
        }
 
        String ban = entity.getBan();
        if (ban != null) {
            stmt.bindString(4, ban);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Detail entity) {
        stmt.clearBindings();
 
        Long d_id = entity.getD_id();
        if (d_id != null) {
            stmt.bindLong(1, d_id);
        }
 
        String contain = entity.getContain();
        if (contain != null) {
            stmt.bindString(2, contain);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(3, location);
        }
 
        String ban = entity.getBan();
        if (ban != null) {
            stmt.bindString(4, ban);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Detail readEntity(Cursor cursor, int offset) {
        Detail entity = new Detail( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // d_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // contain
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // location
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // ban
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Detail entity, int offset) {
        entity.setD_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setContain(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLocation(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBan(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Detail entity, long rowId) {
        entity.setD_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Detail entity) {
        if(entity != null) {
            return entity.getD_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Detail entity) {
        return entity.getD_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}