package mao.test.greendaodemo_my;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.support.multidex.MultiDex;

import com.haha.maolin.DaoMaster;
import com.haha.maolin.DaoSession;

import mao.test.db.DBTotalManager;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        DBTotalManager.getInstance().initDB(this);
    }
}
