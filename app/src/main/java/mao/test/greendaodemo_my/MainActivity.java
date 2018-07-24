package mao.test.greendaodemo_my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.haha.maolin.UserDao;
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

    public  void Add(View v){

    }

    public  void Delete(View v){

    }

    public  void Update(View v){


    }

    public void showInfor(){

    }
}
