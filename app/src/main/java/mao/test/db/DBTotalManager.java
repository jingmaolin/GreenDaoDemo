package mao.test.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.haha.maolin.DaoMaster;
import com.haha.maolin.DaoSession;

import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;

import static com.haha.maolin.DaoMaster.createAllTables;


public class DBTotalManager {
    private static volatile DBTotalManager instance;

    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;

    //    private SQLiteDatabase mDB;
    private Database mDB;

    private final String DB_NAME = "db_bq.db";
    private final int DB_VERSION = 10;

    private DBTotalManager() {

    }

    public static DBTotalManager getInstance() {
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
//        MyDatabaseOpenHelper helper = new MyDatabaseOpenHelper(context, DB_NAME, DB_VERSION);
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME);
//        mDB = helper.getWritableDatabase();
        mDB = helper.getEncryptedWritableDb("123456");
        mDaoMaster = new DaoMaster(mDB);
        mDaoSession = mDaoMaster.newSession();
    }

    public void closeDB() {
        mDaoSession = null;
        mDaoMaster = null;
        if (mDB != null) {
            mDB.close();
            mDB = null;
        }
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }

    public static class MyDatabaseOpenHelper extends DatabaseOpenHelper {

        public MyDatabaseOpenHelper(Context context, String name, int version) {
            super(context, name, version);
        }

        public MyDatabaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(Database db) {
            createAllTables(db, false);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
        }
    }
}
