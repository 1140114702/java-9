package com.zwonb;

import java.util.Random;

/**
 * 随机类Random
 * Created by zwonb on 2017/6/21.
 */
public class RandomDemo {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("随机产生一个整数：" + random.nextInt());
        System.out.println("随机产生一个大于等于0小于10的整数：" + random.nextInt(10));
        System.out.println("随机产生一个布尔型的值：" + random.nextBoolean());
        System.out.println("随机产生一个双精度型的值：" + random.nextDouble());
        System.out.println("随机产生一个浮点型的值：" + random.nextFloat());
        System.out.println("随机产生一个概率密度为高斯分布的双精度值：" + random.nextGaussian());
    }
}
