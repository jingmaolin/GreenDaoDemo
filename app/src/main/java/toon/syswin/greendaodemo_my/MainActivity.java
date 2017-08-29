package toon.syswin.greendaodemo_my;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.syswin.maolin.UserDao;

import java.util.ArrayList;
import java.util.List;

import toon.syswin.greendaodemo_my.bean.User;

public class MainActivity extends AppCompatActivity {

    private UserDao MyUserDao;
    private static int count=100;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyUserDao=MyApplication.getMyApplication().getmDaoSession().getUserDao();
    }
    //增
    public  void Add(View v){

    }

    //删
    public  void Delete(View v){

    }

    //改
    public  void Update(View v){


    }

    //查
    public void showInfor(){

    }
}
