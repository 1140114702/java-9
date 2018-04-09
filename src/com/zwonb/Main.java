package com.zwonb;

import java.text.DecimalFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        double m = 5325.55;
        double km = m / 1000;
        System.out.println(km);
        // 保留小数点后两位，四舍五入
        System.out.println(String.format(Locale.CHINA, "%.2f", km));
//        System.out.println(0.001f);
//        System.out.println(10000000f);
//        //DecimalFormat用于格式化十进制数字
//        DecimalFormat decimalFormat = new DecimalFormat();
//        decimalFormat.applyPattern("#,##0.00'\u00A4'");
//        System.out.println(decimalFormat.format(0.4d));
    }
}
