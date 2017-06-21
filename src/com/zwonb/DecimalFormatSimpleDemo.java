package com.zwonb;

import java.text.DecimalFormat;

/**
 * 数字格式化
 * Created by zwonb on 2017-6-18.
 */
public class DecimalFormatSimpleDemo {

    public static void main(String[] args) {
        SingleFormat("###,###.###", 123465.798);
        SingleFormat("00000000.###kg", 123456.798);
        //按照格式模板格式化数字，不存在的位以0显示
        SingleFormat("000000.000", 123.78);
        //将数字转换为百分比形式
        UseApplyPatternMethodFormat("#.###%", 0.789);
        //将小数点后格式化为两位
        UseApplyPatternMethodFormat("###.##", 123465.789);
        //将数字转化为千分数形式
        UseApplyPatternMethodFormat("0.00\u2030",0.789);
    }

    //使用实例化对象时设置格式化模式
    private static void SingleFormat(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String output = myFormat.format(value);
        System.out.println(value + " " +pattern + " " + output);
    }

    //使用applyPattern()方法对数字进行格式化
    private static void UseApplyPatternMethodFormat(String pattern, double value) {
        DecimalFormat myFormat = new DecimalFormat(pattern);
        myFormat.applyPattern(pattern);
        System.out.println(value + " " + pattern + " " + myFormat.format(value));
    }
}
