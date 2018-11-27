package com.moyan.staticclass;

/**
 * 用户 : 莫言<br>
 * 时间 : 2018/11/22 16:27<br>
 * 类名 : Student<br>
 * 包名 : com.moyan.staticclass<br>
 *
 * <h2>static的注意事项：</h2>
 *   <h3>1 静态方法</h3>
 *           1.1 可以调用静态的成员变量<br>
 *           1.2 可以调用静态的成员方法<br>
 *           1.3 不可以调用非静态成员变量<br>
 *           1.4 不可以调用非静态成员方法<br>
 *           1.5 静态方法只能调用静态的成员<br>
 *   <h3>2 非静态方法</h3>
 *          2.1 可以调用静态的成员变量
 *          2.2 可以调用静态的成员方法
 *          2.3 可以调用非静态的成员变量
 *          2.4 可以调用非静态的成员方法
 *
 * <h2>静态的方法中是否有this这个对象？ 没有的</h2>
 *
 * <h2>
 * static （静态)关键字<br>
 *
 * </h2>
 *
 * @author 莫言
 */
public class StudentDemo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Student.graduateFrom = "传智学院";
        //Student.graduateFrom = "深圳学院";
        Student.study();
    }
}

/**
 * The type Student.
 */
class Student {

    /**
     * The Name.
     */
    String name;
    /**
     * The Age.
     */
    int age;
    /**
     * The Graduate from.
     */
    static String graduateFrom;

    /**
     * Study.
     */
    public static void study() {
        System.out.println(graduateFrom);

        //System.out.println(Name);

        /**直接调用静态方法*/
        sleep();

        //eat();

    }

    /**
     * 静态方法<br>
     * Sleep.
     */
    public static void sleep() {
        System.out.println("sleep 睡觉");
    }

    /**
     * 非静态方法<br>
     * Eat.
     */
    public void eat() {
        System.out.println("eat 吃");

        sleep();

        System.out.println(graduateFrom);

        this.name = "莫言";
    }
}
