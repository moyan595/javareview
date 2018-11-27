package com.moyan.staticclass;

/**
 * 用户 : 莫言<br>
 * 时间 : 2018/11/23 16:39<br>
 * 类名 : Coder<br>
 * 包名 : com.moyan.staticclass<br>
 *Coder静态代码块执行 --- Coder构造代码执行 --- Coder无参空构造执行
 *
 * BlockTest静态代码块执行 --- BlockTest主函数执行了 --- Coder静态代码块执行 --- Coder构造代码块执行 ---Coder无参空构造代码块执行
 *
 *  Coder构造代码块执行  --- Coder无参空构造执行
 * @author 莫言
 */

public class BlockTest {

    static {
        System.out.println("BlockTest静态代码块执行");
    }

    {
        System.out.println("BlockTest静态代码块执行");
    }

    public BlockTest() {
        System.out.println("BlockTest无参构造执行");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest的主函数执行了");
        Coder coder = new Coder();
        Coder coder1 = new Coder();

    }
}


class Coder {
    static {
        System.out.println("Coder静态代码块执行");
    }

    {
        System.out.println("Coder构造代码执行");
    }
 public Coder() {
        System.out.println("Coder无参构造执行");
    }


}
