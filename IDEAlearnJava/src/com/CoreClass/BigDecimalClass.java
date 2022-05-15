package com.CoreClass;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalClass {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("123.4567");
        System.out.println(bd.multiply(bd)); //乘法

        //scale获取有几个小数
        BigDecimal d1 = new BigDecimal("123.45");
        BigDecimal d2 = new BigDecimal("123.4500");
        BigDecimal d3 = new BigDecimal("1234500");
        System.out.println(d1.scale());
        System.out.println(d2.scale());
        System.out.println(d3.scale());

        //去小数点后尾零
        System.out.println(d2.stripTrailingZeros());
        BigDecimal d4 = d3.stripTrailingZeros();
        System.out.println(d4);
        System.out.println(d4.scale()); //我不理解

        BigDecimal d5 = new BigDecimal("123.456789");
        BigDecimal d6 = d5.setScale(4, RoundingMode.HALF_UP);//保留四位，四舍五入
        BigDecimal d7 = d5.setScale(4,RoundingMode.DOWN);//直接截断
        System.out.println(d6);
        System.out.println(d7);

        //用BigDecimal 做加减乘，不会丢失精度，但除法会。
        BigDecimal d8 = new BigDecimal("123.456");
        BigDecimal d9 = new BigDecimal("23.456789");
//        BigDecimal d10 = d1.divide(d2,10,RoundingMode.HALF_UP);
//        System.out.println("d10 = " + d10);

        //求余数
        BigDecimal n = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr[0]);
        System.out.println(dr[1]);

        //判断两个BigDecimal 是否是整数倍数
        BigDecimal n1 = new BigDecimal("12.75");
        BigDecimal m1 = new BigDecimal("0.15");
        BigDecimal[] dr2 = n1.divideAndRemainder(m1);
        if(dr2[1].signum() == 0){
            System.out.println("yes");
        }

        //比较两个BigDecimal是否相等，要求它们的scale()也要相等。
        BigDecimal e1 = new BigDecimal("123.456");
        BigDecimal e2 = new BigDecimal("123.456000");
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e2.stripTrailingZeros()));
        System.out.println(e1.compareTo(e2)); // 推荐的比较方法，根据两个值的大小分别返回负数、正数和0
    }
}
