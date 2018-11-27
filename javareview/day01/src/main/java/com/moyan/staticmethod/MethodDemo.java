package com.moyan.staticmethod;

/**
 * 用户 : 莫言<br>
 * 时间 : 2018/11/21 15:15<br>
 * 类名 : MethodDemo<br>
 * 包名 : com.moyan.staticmethod
 *
 *
 * <br>
 * 需求：定义一个方法求两个数的和，并在主方法中调用
 * <br>
 * 方法： 类中的一段具有特定功能的程序，提高了代码的复用性和可维护性
 * <br>
 * <h2>定义格式：</h2>
 *          public static 返回类型(没有返回值写 void ) 方法名(参数类型 参数名1, 参数类型 参数名2){ <br>
 *              方法体;<br>
 *          }
 *<br>
 *<h2>调用方式：</h2>
 *      <h3>1. 有明确的返回值类型：</h3>
 *                      1.1 赋值调用,将方法的返回值赋值给一个变量
 *                      <br>
 *                      1.2 输出调用,使用输出语句直接输出方法的返回参数
 *                      <br>
 *                      1.3 直接调用,没法获取方法的返回值
 *                      <br>
 *     <h3>2. 没有明确返回值类型：</h3>
 *                         2.1 直接调用
 *<br>
 *<h2>方法重载：</h2>
 * 在一个类中有多个重名的方法，这些方法参数不同,和返回值无关
 *
 *  <p>
 * <h2>注意：</h2>
 *     <h3>1.形参：</h3>
 *     1.1 方法生明的变量,只能是变量,接收方法调用时传递进来的数据
 *     <h3>2.实参：</h3>
 *     2.1 调用方法时传递的数据，可以是常量也可以是变量
 * </p>
 *
 * @author 莫言
 */
public class MethodDemo {


    /**
     * The entry point of application
     * 调用方法传入参数 实参也可以是变量.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //赋值调用
        /**                    实数*/
        int sum = sum(10,20);
        System.out.println(sum);

        //输出调用 (输出调用,输出完返回值就没有了,无法再做其他调用)
        int a = 10;
        int b = 30;
        System.out.println(sum(a, b));
    }

    /**
     * sum
     * 形参只能是变量.
     * @param a int
     * @param b int
     * @return int
     */
    public static int sum (int a, int b){
       /* //使用变量接收求和结果并返回
        int sum = a + b;
        return sum;*/

       //直接返回求和结果
        return a + b;

    }

}
