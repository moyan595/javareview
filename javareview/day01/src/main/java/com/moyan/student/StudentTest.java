package com.moyan.student;

/**
 * 用户 : 莫言<br>
 * 时间 : 2018/11/22 14:59<br>
 * 类名 : StudentTest<br>
 * 包名 : com.moyan.student<br>
 *
 * @author 莫言
 */

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("jk", 18, "nan");
        student.show();

        Student student2 = new Student();
        student2.setName("kl");
        student2.setAge(56);
        student2.setGender("woman");
        student2.show();

    }
}
