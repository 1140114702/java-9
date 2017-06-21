package com.zwonb;

import java.math.BigInteger;

/**
 * BigInteger应用--支持任意精度的整数
 * Created by zwonb on 2017/6/21.
 */
public class BigIntegerDemo {

    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("4");
        System.out.println("加法操作：" + bigInteger.add(new BigInteger("2")));
        System.out.println("减法操作：" + bigInteger.subtract(new BigInteger("2")));
        System.out.println("乘法操作：" + bigInteger.multiply(new BigInteger("2")));
        System.out.println("除非操作：" + bigInteger.divide(new BigInteger("2")));
        //除以3的商--[0]表示拿到第一个
        System.out.println("取商：" + bigInteger.divideAndRemainder(new BigInteger("3"))[0]);
        //除以3的余数--[1]表示拿到第二个
        System.out.println("取商：" + bigInteger.divideAndRemainder(new BigInteger("3"))[1]);
        System.out.println("做2的次方操作：" + bigInteger.pow(2));
        System.out.println("取相反数：" + bigInteger.negate());
    }
}
