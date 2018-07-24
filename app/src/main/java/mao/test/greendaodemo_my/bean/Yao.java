package mao.test.greendaodemo_my.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Description:
 * author:jingmaolin
 * email:1271799407@qq.com.
 * phone:13342446520.
 * date: 2018/7/24.
 */
@Entity
public class Yao {
    @Id(autoincrement = true)
    @Property(nameInDb = "yao_id")
    private Long y_id;            //唯一标识
    private String name;        //名称
    private long price;         //价格
    private String number;      //编号

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getPrice() {
        return this.price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getY_id() {
        return this.y_id;
    }

    public void setY_id(Long y_id) {
        this.y_id = y_id;
    }



    @Generated(hash = 1038840476)
    public Yao(Long y_id, String name, long price, String number) {
        this.y_id = y_id;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    @Generated(hash = 756107505)
    public Yao() {
    }
}
