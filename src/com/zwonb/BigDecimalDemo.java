package com.zwonb;

import java.math.BigDecimal;

/**
 * BigDecimal大数字运算，支持任何精度的定点数
 * Created by zwonb on 2017/6/21.
 */
public class BigDecimalDemo {

    private static final int location = 10;

    public static void main(String[] args) {
        BigDecimalDemo b = new BigDecimalDemo();
        System.out.println("两个数字相加结果：" + b.add(-7.5, 8.9));
        System.out.println("两个数字相减结果：" + b.sub(-7.5, 8.9));
        System.out.println("两个数字相乘结果：" + b.mul(-7.5, 8.9));
        System.out.println("两个数字相除结果,结果小数后保留10位：" + b.div(10, 2));
        System.out.println("两个数字相除结果,结果小数后保留5位：" + b.div(-7.5, 8.9, 5));
    }

    /**
     * 定义加法方法
     */
    private BigDecimal add(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.add(b2);
    }

    /**
     * 定义减法方法
     */
    private BigDecimal sub(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.subtract(b2);
    }

    /**
     * 定义乘法方法
     */
    private BigDecimal mul(double value1, double value2) {
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.multiply(b2);
    }

    /**
     * 定义除法方法
     */
    private BigDecimal div(double value1, double value2) {
        return div(value1, value2, location);
    }

    /**
     * 定义除法方法，b表示保留b位小数
     */
    private BigDecimal div(double value1, double value2, int b) {
        if (b < 0) {
            System.out.println("b值必须大于等于0");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        //结果四舍五入保留b位小数
        return b1.divide(b2, b, BigDecimal.ROUND_HALF_UP);
    }
}
