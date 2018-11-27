package com.moyan.utils_static;

/**
 * 用户 : 莫言<br>
 * 时间 : 2018/11/23 9:45<br>
 * 类名 : MyArraysTest<br>
 * 包名 : com.moyan.utils_static<br>
 * @author 莫言
 */

public class MyArraysTest {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 70, 40, 50, 60};
        int max = MyArrays.getMax(arr);
        System.out.println("自定义工具类取数组中最大值" + max);

        int index = MyArrays.getIndex(arr, 60);
        System.out.println("自定义工具类取数组中索引" + index);
    }
}
