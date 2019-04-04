package model;

import javax.persistence.*;

/**
 * Created by Jeff on 2018/10/30.
 */
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private Integer age;
  /* @Column(name="classId")
    private String classId;*/
    @Column(name="className")
    private String className;
    @Column(name="phoneNumber")
    private String phoneNumber;
    @Column(name="parentName")
    private String parentName;

    @ManyToOne(targetEntity=Teacher.class,cascade={CascadeType.ALL})
    @JoinColumn(name="teacherid"
            , referencedColumnName="id" , unique=true)
    private Teacher teacher;

    @Column(name="socre")
    private String socre;
    @Column(name="level")
    private String level;
    @Column(name="money")
    private String money;
    @Column(name="usableClass")
    private String usableClass;
    @Column(name="insertTime")
    private String insertTime;
    @Column(name="updateTime")
    private String updateTime;
    @Column(name="insertName")
    private String insertName;
    @Column(name="updateName")
    private String updateName;
    @ManyToOne(targetEntity=Class.class,cascade=CascadeType.ALL)
    @JoinColumn(name="classid"
            , referencedColumnName="id" , unique=true)
    private Class aClass;


   public Student() {
   }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

   /*public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }*/

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getSocre() {
        return socre;
    }

    public void setSocre(String socre) {
        this.socre = socre;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getUsableClass() {
        return usableClass;
    }

    public void setUsableClass(String usableClass) {
        this.usableClass = usableClass;
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

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }
}
