package com.moyan.Aarray;

/**
 * 用户 : 莫言<br>
 * 时间 : 2018/11/22 10:46<br>
 * 类名 : ArrayDemo<br>
 * 包名 : com.moyan.Aarray<br>
 *
 * <h1>需求； 定义一个元素类型为int的数组,遍历数组并求和</h1>
 * <h2>1. 数组： </h2>
 *            1.1 用于存储多个元素的一种容器
 * <h2>2. 数组的特点：</h2>
 *      2.1 元素类型必须一致<br>
 *      2.2 元素有整数索引<br>
 *      2.3 一旦定义好长度侧无法改变<br>
 *      2.4 可以存储基本数据类型<br>
 *      2.5 也可以存储引用数据类型
 * <h2>3. 定义格式： </h2>
 *      3.1 动态初始化<br>
 *          3.1.1 元素类型[] 数组名 = new 元素类型[10];<br>
 *      3.2 静态初始化<br>
 *          3.2.1 元素类型[] 数组名 = {元素1, 元素2, 元素3};<br>
 *          3.2.2 元素类型[] 数组名 = new 元素类型[] {元素1, 元素2, 元素3};
 * @author 莫言
 */

public class ArrayDemo {

    public static void main(String[] args) {
        //使用静态初始化定义数组
        int[] arr = {1, 2, 3 , 4, 5};
        //定义一个变量用于存储求和结果
        int sum = 0;
        //遍历数组
        for(int x = 0; x < arr.length; x++ ){
            sum += arr[x];
        }
        System.out.println("测试数组" + sum);
    }


}
