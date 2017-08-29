package toon.syswin.greendaodemo_my;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.syswin.maolin.DaoMaster;
import com.syswin.maolin.DaoSession;

/**
 * Created by 600029 on 2017/8/22.
 */

public class MyApplication extends Application{

    private DaoMaster.DevOpenHelper mHelper;
    private SQLiteDatabase db;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;
    public static MyApplication instances;

    public static MyApplication getMyApplication(){
        return instances;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        instances=this;

        mHelper=new DaoMaster.DevOpenHelper(this,"test");
        db=mHelper.getWritableDatabase();
        mDaoMaster=new DaoMaster(db);
        mDaoSession=mDaoMaster.newSession();
    }

    public DaoSession getmDaoSession(){
        return mDaoSession;
    }
}
