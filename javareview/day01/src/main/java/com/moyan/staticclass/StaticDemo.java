package com.moyan.staticclass;

/**
 * 用户 : 莫言<br>
 * 时间 : 2018/11/22 15:20<br>
 * 类名 : StaticDemo<br>
 * 包名 : com.moyan.staticclass<br>
 * <h2>static: 是 一个关键字,用于修饰成员变量和成员方法</h2>
 * <h2>static的特点:</h2>
 *          被所有的对象所共享<br>
 *          可以使用类名调用<br>
 *          静态方法加载优先于对象<br>
 *          随着类的加载而加载(内存方法区当中)
 * @author 莫言
 */
public class StaticDemo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person.graduateFrom = "传智学院";
        Person person = new Person();
        person.name = "dd";
        person.age = 56;
        //person.graduateFrom = "shenzhen";
        person.speak();

        Person person2 = new Person();
        person2.name = "dd";
        person2.age = 56;
        //person2.graduateFrom = "shenzhen";
        person2.speak();
    }
}


/**
 * The type Person.
 */
class Person {
    /**
     * The Name.
     */
    String name;
    /**
     * The Age.
     */
    int age;
    /**
     * The Graduate from
     * 毕业院校.
     */
    static String graduateFrom;

    /**
     * Speak.
     */
    public void speak() {
        System.out.println(name + "........" + age + "#######" + graduateFrom);
    }

}
