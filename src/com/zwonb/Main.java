package com.zwonb;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(0.001f);
        System.out.println(10000000f);
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,##0.00'\u00A4'");
        System.out.println(decimalFormat.format(0.4d));
    }
}
