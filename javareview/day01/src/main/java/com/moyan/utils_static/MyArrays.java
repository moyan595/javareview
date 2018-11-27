package com.moyan.utils_static;

/**
 * 用户 : 莫言<br>
 * 时间 : 2018/11/23 9:27<br>
 * 类名 : MyArrays<br>
 * 包名 : com.moyan.utils_static<br>
 *
 * @author 莫言
 */
public class MyArrays {

    /**
     * Instantiates a new My arrays.
     */
    private MyArrays() {
    }

    /**
     * 返回数组中最大的元素
     *
     * @param arr the arr
     * @return the int
     */
    public static int getMax(int[] arr) {
        /*参照物*/
        int max = 0;
        /**遍历数组*/
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > max) {
                /*替换参照物*/
                max = arr[x];
            }
        }
        return max;
    }

    /**
     * 返回数组中指定的参数的索引
     *
     * @param arr the arr
     * @param a   the a
     * @return the int
     */
    public static int getIndex(int[] arr, int a) {
        //遍历集合
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == a) {
                return x;
            }
        }
        /*如果查不到指定的参数，则返回-1*/
        return -1;
    }
}
