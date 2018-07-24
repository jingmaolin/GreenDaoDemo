package mao.test.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.haha.maolin.DaoMaster;
import com.haha.maolin.DaoSession;

import org.greenrobot.greendao.database.DatabaseOpenHelper;


public class DBTotalManager {
    private static volatile DBTotalManager instance;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;
    private SQLiteDatabase mDB;
    private final String DB_NAME = "db_bq.db";
    private final int DB_VERSION = 1;

    private DBTotalManager() {

    }

    public DBTotalManager getInstance() {
        if (instance == null) {
            synchronized (DBTotalManager.class.getName()) {
                if (instance == null) {
                    instance = new DBTotalManager();
                }
            }
        }
        return instance;
    }

    public void initDB(Context context) {
        MyDatabaseOpenHelper helper = new MyDatabaseOpenHelper(context, DB_NAME, DB_VERSION);
        mDB = helper.getWritableDatabase();
        mDaoMaster = new DaoMaster(mDB);
        mDaoSession = mDaoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }

    private static class MyDatabaseOpenHelper extends DatabaseOpenHelper {

        public MyDatabaseOpenHelper(Context context, String name, int version) {
            super(context, name, version);
        }

        public MyDatabaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }
    }
}
