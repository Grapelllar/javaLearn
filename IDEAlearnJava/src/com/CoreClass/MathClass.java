package com.CoreClass;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class MathClass {
    public static void main(String[] args) {
        //����ֵ
        System.out.println(Math.abs(-100));
        System.out.println(Math.abs(-7.8));

        //���ֵ����Сֵ
        System.out.println(Math.max(100,99));
        System.out.println(Math.min(1.2,2.3));

        //����η���x��y�η�
        System.out.println(Math.pow(2,10));

        //���㿪��
        System.out.println(Math.sqrt(2));

        //����e��x�η�
        System.out.println(Math.exp(2));

        //������eΪ�׵���
        System.out.println(Math.log(4));

        //������10Ϊ�׵Ķ���
        System.out.println(Math.log10(100));

        //���Ǻ���
        System.out.println(Math.sin(3.14));
        System.out.println(Math.cos(3.14));
        System.out.println(Math.tan(3.14));
        System.out.println(Math.asin(1.0));
        System.out.println(Math.acos(1.0));

        //��ѧ����
        double e = Math.E;
        System.out.println(Math.sin(Math.PI / 6));

        //�����
        System.out.println(Math.random());
        //[MIN,MAX)��Χ��
        double x = Math.random();
        double min = 10;
        double max = 50;
        double y = x * (max - min) + min;
        long n = (long)y;
        System.out.println(y);
        System.out.println(n);

        //α���������ָ����ʼ���ӣ�����ʱ���
        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(10));     //[0,10)֮���int
        System.out.println(r.nextLong());
        System.out.println(r.nextFloat());    //����[0��1)֮��
        System.out.println(r.nextDouble());   //ͬ��

        //α�������ָ����ʼ����
        Random r2 = new Random(12345);
        for(int i = 0 ; i < 10; i++){
            System.out.println(r2.nextInt(100));
        }

        //randomʵ���ڲ�Ҳ��Random��Ҳ��α�����

        //���������SecureRandom��������ѧ��
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
