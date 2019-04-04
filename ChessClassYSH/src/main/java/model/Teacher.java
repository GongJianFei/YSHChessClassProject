package model;

import javax.persistence.*;

/**
 * Created by Jeff on 2018/10/30.
 */
@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="teacher_name")
    private String teacher_name;
    @Column(name="teacher_age")
    private Integer teacher_age;
    @Column(name="gender")
    private String gender;
    @Column(name="inserttime")
    private String inserttime;
    @Column(name="insertname")
    private String insertname;
    @Column(name="updatetime")
    private String updatetime;
    @Column(name="updatename")
    private String updatename;

    @Column(name="insertTime")
    private String insertTime;
    @Column(name="updateTime")
    private String updateTime;
    @Column(name="insertName")
    private String insertName;
    @Column(name="updateName")
    private String updateName;
   public Teacher() {
   }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public Integer getTeacher_age() {
        return teacher_age;
    }

    public void setTeacher_age(Integer teacher_age) {
        this.teacher_age = teacher_age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInserttime() {
        return inserttime;
    }

    public void setInserttime(String inserttime) {
        this.inserttime = inserttime;
    }

    public String getInsertname() {
        return insertname;
    }

    public void setInsertname(String insertname) {
        this.insertname = insertname;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getInsertName() {
        return insertName;
    }

    public void setInsertName(String insertName) {
        this.insertName = insertName;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }
}
