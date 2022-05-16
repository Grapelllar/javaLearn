package com.Exception;

import java.util.Scanner;
import java.util.Arrays;
import java.io.UnsupportedEncodingException;

public class JavaException {
    public static void main(String[] args) throws Exception{ //在主函数声明throws所有异常，代价是一旦异常，程序立刻退出

//        Scanner s = new Scanner(System.in);
//        int t = Integer.parseInt(s);
//        System.out.println(t);

        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
        try {
            byte[] bs2 = toGBBK("中文");
            System.out.println(Arrays.toString(bs2));
        }catch (UnsupportedEncodingException e){
            System.out.println(e);
            e.printStackTrace(); //打印异常栈
        }
    }

    static byte[] toGBK(String s){
        try{
            //用指定编码转换String为byte[]
            return s.getBytes("GBaaK");
        }catch (UnsupportedEncodingException e){
            System.out.println(e);
            return s.getBytes();
        }
    }

    static byte[] toGBBK(String s)throws UnsupportedEncodingException{
        return s.getBytes("GBBK");
    }
}

