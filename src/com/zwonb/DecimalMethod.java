package com.zwonb;

import java.text.DecimalFormat;

/**
 * 数字分组
 * Created by zwonb on 2017/6/18.
 */
public class DecimalMethod {

    public static void main(String[] args) {
        DecimalFormat myFormat = new DecimalFormat();
        //设置将数字分组为2
        myFormat.setGroupingSize(2);
        String output = myFormat.format(123456.789);
        System.out.println("将数字以每两个数组进行分组" + output);
        //设置不允许数字进行分组
        myFormat.setGroupingUsed(false);
        String output2 = myFormat.format(123456.789);
        System.out.println("不允许数字分组" + output2);
    }
}
