package com.zwonb;

/**
 * 取整函数
 * Created by zwonb on 2017/6/21.
 */
public class IntFunction {

    public static void main(String[] args) {
        System.out.println("使用ceil()方法取整" + Math.ceil(5.2));
        System.out.println("使用floor()方法取整" + Math.floor(2.5));
        System.out.println("使用rint()方法取整" + Math.rint(2.7));
        System.out.println("使用rint()方法取整" + Math.rint(2.5));
        System.out.println("使用round(float)方法取整" + Math.round(3.4f));
        System.out.println("使用round(double)方法取整" + Math.round(2.5));
    }
}
