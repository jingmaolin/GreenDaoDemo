package mao.test.greendaodemo_my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.haha.maolin.DaoSession;

import mao.test.db.DBTotalManager;
import mao.test.greendaodemo_my.bean.Detail;
import mao.test.greendaodemo_my.bean.Yao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DBTotalManager.getInstance().closeDB();
    }

    public void Add(View v) {
//        for (int i = 0; i < 50; i++) {
//            Detail detail = new Detail();
//            detail.setBan("不能多吃，哈哈" + i);
//            detail.setContain("山楂，枸杞，大枣" + i);
//            detail.setLocation("3P4L" + i);
//            DBTotalManager.getInstance().getDaoSession().getDetailDao().insert(detail);
//        }
//
//        for (int i = 0; i < 50; i++) {
//            Yao yao = new Yao();
//            yao.setName("十全大补丸" + i);
//            yao.setPrice(20 + i);
//            yao.setNumber("3P4L" + i);
//            DBTotalManager.getInstance().getDaoSession().getYaoDao().insert(yao);
//        }

//        Yao yao = new Yao();
//        yao.setY_id(10L);
//        yao.setName("十全大补丸yo");
//        yao.setPrice(20 + 10);
//        yao.setNumber("3P4L");
//        DBTotalManager.getInstance().getDaoSession().getYaoDao().insertOrReplaceInTx(yao);

        DBTotalManager.getInstance().getDaoSession().getYaoDao().getDatabase().execSQL("insert into YAO(NAME,PRICE,NUMBER) values(?,?,?)",
                new String[]{"语句执行", "100000", "11P33L"});
    }

    public void Delete(View v) {

    }

    public void Update(View v) {


    }

    public void query(View v) {

    }
}
