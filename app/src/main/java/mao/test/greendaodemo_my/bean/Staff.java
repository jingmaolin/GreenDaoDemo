package mao.test.greendaodemo_my.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;


@Entity
public class Staff{
    @Id
    private  long stfID;
    private String name;
    private int age;
    private String department;
    public String getDepartment() {
        return this.department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getStfID() {
        return this.stfID;
    }
    public void setStfID(long stfID) {
        this.stfID = stfID;
    }
    @Generated(hash = 1312564155)
    public Staff(long stfID, String name, int age, String department) {
        this.stfID = stfID;
        this.name = name;
        this.age = age;
        this.department = department;
    }
    @Generated(hash = 1774984890)
    public Staff() {
    }

}
