package com.CoreClass;

import java.math.BigInteger;

public class BigIntegerClass {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("12312412125125");
        System.out.println(bi1.pow(10));
        BigInteger bi2 = new BigInteger("1298418258125");
        BigInteger sum = bi1.add(bi2);
        System.out.println(sum);
        System.out.println(bi1.longValue());
//        System.out.println(bi1.multiply(bi1).longValueExact());
        //Exact()方法用于不丢失高位，而进行报错
        BigInteger n = new BigInteger("999999").pow(99);
        float f= n.floatValue();
        System.out.println(f);//无限大
    }
}
