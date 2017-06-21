package com.zwonb;

/**
 * 字符随机
 * Created by zwonb on 2017/6/21.
 */
public class MathRandomChar {

    public static void main(String[] args) {
        //a～z之间的字符
        System.out.println((char) ('a' + Math.random() * ('z' - 'a' + 1)));

        System.out.println("任意小写字符：" + getRandomChar('a', 'z'));
        System.out.println("任意大写字符：" + getRandomChar('A', 'Z'));
        System.out.println("0到9任意数字：" + getRandomChar('0', '9'));
    }

    private static char getRandomChar(char cha1, char cha2) {
        return (char) (cha1 + Math.random() * (cha2 - cha1 + 1));
    }
}
