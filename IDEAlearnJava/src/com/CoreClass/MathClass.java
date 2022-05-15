package com.CoreClass;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class MathClass {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(-100));
        System.out.println(Math.abs(-7.8));

        //最大值、最小值
        System.out.println(Math.max(100,99));
        System.out.println(Math.min(1.2,2.3));

        //计算次方，x的y次方
        System.out.println(Math.pow(2,10));

        //计算开根
        System.out.println(Math.sqrt(2));

        //计算e的x次方
        System.out.println(Math.exp(2));

        //计算以e为底的数
        System.out.println(Math.log(4));

        //计算以10为底的对数
        System.out.println(Math.log10(100));

        //三角函数
        System.out.println(Math.sin(3.14));
        System.out.println(Math.cos(3.14));
        System.out.println(Math.tan(3.14));
        System.out.println(Math.asin(1.0));
        System.out.println(Math.acos(1.0));

        //数学常量
        double e = Math.E;
        System.out.println(Math.sin(Math.PI / 6));

        //随机数
        System.out.println(Math.random());
        //[MIN,MAX)范围内
        double x = Math.random();
        double min = 10;
        double max = 50;
        double y = x * (max - min) + min;
        long n = (long)y;
        System.out.println(y);
        System.out.println(n);

        //伪随机数，不指定初始种子，则用时间戳
        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(10));     //[0,10)之间的int
        System.out.println(r.nextLong());
        System.out.println(r.nextFloat());    //生成[0，1)之间
        System.out.println(r.nextDouble());   //同上

        //伪随机数，指定初始种子
        Random r2 = new Random(12345);
        for(int i = 0 ; i < 10; i++){
            System.out.println(r2.nextInt(100));
        }

        //random实际内部也是Random，也是伪随机数

        //真随机数，SecureRandom，量子力学！
        SecureRandom sr = new SecureRandom();
        System.out.println("sr = " + sr.nextInt(100));

        SecureRandom sr2 = null;
        try{
            sr2 = SecureRandom.getInstanceStrong();
        }catch (NoSuchAlgorithmException e1){
            sr2 = new SecureRandom();
        }
        byte[] buffer = new byte[16];
        sr2.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
    }
}
