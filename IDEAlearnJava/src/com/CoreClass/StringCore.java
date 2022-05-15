package com.CoreClass;

import java.util.Arrays;

public class StringCore {

    public static void main(java.lang.String[] args) {
        // TODO Auto-generated method stub

        //�ַ����Ƚϣ��ɹ�����Ϊ����ͬһ������
        java.lang.String s1 = "hello";
        java.lang.String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        //δ��ͬһ�����أ����ɹ�
        java.lang.String s3 = "hello";
        java.lang.String s4 = "HELLO".toLowerCase();
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        //�����Ӵ�
        System.out.println("Hello".contains("ll"));
        System.out.println("Hello".lastIndexOf("l"));
        System.out.println("Hello".startsWith("He"));
        System.out.println("Hello".endsWith("lo"));

        //��ȡ�Ӵ�
        System.out.println("Hello".substring(2));
        System.out.println("Hello".substring(2,4));

        //ȥ����β�հ��ַ�
        System.out.println("  \tHello\r\n".trim());
        System.out.println("\u3000Hello\u3000".strip());
        System.out.println(" Hello ".stripLeading());
        System.out.println(" Hello ".stripTrailing());

        //�ж��Ƿ�Ϊ�պͿհ��ַ���
        System.out.println("".isEmpty());
        System.out.println("  ".isEmpty());
        System.out.println(" \n".isBlank());
        System.out.println("Hello ".isBlank());

        //�滻�Ӵ�
        java.lang.String s = "hello";
        System.out.println(s.replace('l','~'));
        System.out.println(s.replace("ll","ff"));
        //������ʽ
        java.lang.String s5 = "A,,B;C,D";
        System.out.println(s5.replaceAll("[\\,\\;\\s]+",","));

        //�ָ��ַ���
        java.lang.String s6 = "A,B,C,D";
        java.lang.String[] ss = s6.split("\\,");
        for(java.lang.String so : ss){
            System.out.println(so);
        }

        //ƴ���ַ���
        java.lang.String[] arr = {"A","B","C"};
        java.lang.String s7 = java.lang.String.join("***",arr);
        System.out.println(s7);

        //��ʽ���ַ���
        java.lang.String s8 = "Hi %s, your score is %d!";
        System.out.println(s8.formatted("Alice",80));
        System.out.println(java.lang.String.format("Hi %s, your scroe is %.2f!","Bob",59.9));

        //����ת��
        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(45.67));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(new Object()));
        int n1 = Integer.parseInt("123");
        System.out.println(n1);
        int n2 = Integer.parseInt("ff",16);
        System.out.println(n2);
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);
        boolean b2 = Boolean.parseBoolean("FALSE");
        System.out.println(b2);
//        int v = Integer.getInteger("java.version");
//        System.out.println(v);
        char[] cs = "hello".toCharArray();
        System.out.println(cs);
        String s10 = new String(cs);
        System.out.println(Arrays.toString(cs)); //����ַ�����

        //����
        byte[] by1 = "Hello".getBytes();
        System.out.println(by1);

        //String.getBytes���׳��쳣��������try catch��׽
        try {
            byte[] by2 = "Hello".getBytes("UTF-8");
            System.out.println(by2);
        }catch (Exception e){
            System.out.println("error");
        }

        //Java��String �� char ���ڴ��������� Unicode �����ʾ

        String t1 = "abcde";
        System.out.println(t1);
        String t2 = t1;
        t1 = "o";
        System.out.println(t1);
    }
}
