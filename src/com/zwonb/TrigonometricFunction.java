package com.zwonb;

/**
 * 数学运算-三角函数
 * Created by zwonb on 2017/6/18.
 */
public class TrigonometricFunction {

    public static void main(String[] args) {
        //取90°的正弦--1度等于 Math.PI/180 ，π=Math.PI 等于180度
        System.out.println("90度的正弦值：" + Math.sin(Math.PI / 2));
        //取0度的余弦
        System.out.println("0度的余弦值：" + Math.cos(0));
        //取60度的正切
        System.out.println(Math.tan(Math.PI / 3));
        //取2的平方根与2商的反正弦
        System.out.println(Math.asin(Math.sqrt(2) / 2));
        //取2的平方根与2商的反余弦
        System.out.println(Math.acos(Math.sqrt(2) / 2));
        //取120度的弧度值
        System.out.println(Math.toRadians(120.0));
        //取π/2 的角度
        System.out.println(Math.toDegrees(Math.PI / 2));
    }
}
