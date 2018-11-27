package com.moyan.exam;

/**
 * 用户 : 莫言<br>
 * 时间 : 2018/11/23 10:25<br>
 * 类名 : BookDemo<br>
 * 包名 : com.moyan.exam<br>
 *
 * @author 莫言
 */
public class BookDemo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
      /*  //局部代码块： 存在于方法中, 控制变量的生命周期(作用域)
        {
            for (int x = 0; x < 10; x++) {
                System.out.println("我爱Java1");
                int num = 10;
            }
            //外部不可调用局部代码块属性(变量)
            //System.out.println(num);*/

            Teacher t1 = new Teacher();
            Teacher t2 = new Teacher("小苍老师", 18);

        }

}

/**
 * The type Teacher.
 */
class Teacher {
    /**
     * The Name.
     */
    String name;
    /**
     * The Age.
     */
    int age;

    /**
     * Instantiates a new Teacher.
     */
    public Teacher() {
            System.out.println("我是无参构造");
    }

    /**
     * Instantiates a new Teacher.
     *
     * @param name the name
     * @param age  the age
     */
    public Teacher(String name, int age) {
            System.out.println("我是有参构造");
        this.name = name;
        this.age = age;
    }

/*    //构造代码块： 提取构造方法中的共性, 每次创建对象都会执行,并且在构造方法执行前执行
    {*//*
        for (int x = 0; x < 10; x++) {
            System.out.println("我爱Java1");
        }*//*
            System.out.println("我爱Java");
    }*/

    //静态代码块： 随着类的加载而加载,只加载一次,加载类时需要的一些初始化,比如加载驱动
    static {
        System.out.println("我爱Java");
    }
}

