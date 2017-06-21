package com.zwonb;

/**
 * 随机数
 * Created by zwonb on 2017/6/21.
 */
public class MathRandom {

    public static void main(String[] args) {
        System.out.println("任意一个2到23之前的偶数：" + getEvenNum(2, 32));

    }

    private static int getEvenNum(double num1, double num2) {
        //产生num1～num2之前的随机数
        int s = (int) (num1 + (Math.random() * (num2 - num1)));
        //是否是偶数
        if (s % 2 == 0) {
            return s;
        } else {
            return s + 1;
        }

    }
}
