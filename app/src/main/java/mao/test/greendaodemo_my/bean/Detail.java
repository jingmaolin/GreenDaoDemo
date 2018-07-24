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
@Entity(nameInDb = "detail")
public class Detail {
    @Id(autoincrement = true)
    @Property(nameInDb = "detail_id")
    private Long d_id;          //唯一标识
    private String contain;     //成分
    private String location;    //存放位置
    private String ban;       //禁忌

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContain() {
        return this.contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    public String getBan() {
        return this.ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public Long getD_id() {
        return this.d_id;
    }

    public void setD_id(Long d_id) {
        this.d_id = d_id;
    }


    @Generated(hash = 1409709588)
    public Detail(Long d_id, String contain, String location, String ban) {
        this.d_id = d_id;
        this.contain = contain;
        this.location = location;
        this.ban = ban;
    }

    @Generated(hash = 1665969126)
    public Detail() {
    }
}
