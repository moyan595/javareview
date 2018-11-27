package com.moyan.student;

/**
 * 用户 : 莫言<br>
 * 时间 : 2018/11/22 11:36<br>
 * 类名 : Student<br>
 * 包名 : com.moyan.student<br>
 *
 * <h2>定义一个标准的学生类,在主方法中创建对象并使用</h2>
 * 姓名, 年龄, 性别3个变量<br>
 * 无参,有参两个构造方法<br>
 * 为每个成员变量定义getter/setter方法<br>
 * 定义一个show方法,输出成员变量<br>
 *
 * @author 莫言
 */
public class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别
     */
    private String gender;

    /**
     * 无参构造器
     */
    public Student(){}

    /**
     * 有参构造器 @param name the name
     *  @param name   the name
     * @param age    the age
     * @param gender the gender
     */
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Show.
     */
    public void show(){
        System.out.println(name + "," + age + "," + gender);
    }
}
