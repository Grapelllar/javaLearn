package com.Exception;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

public class JavaCatch {
    public static void main(String[] args) throws Exception {

        try{
//            Scanner s = new Scanner(System.in);
            File file = new File("test.txt");
            FileInputStream fileInputStream = null;
            fileInputStream = new FileInputStream(file);
            //上面异常，则下面不执行,即中断
            process1();
            process2();
            process3();
        }catch (IOException | NumberFormatException e){ //捕获异常打印相同内容，非继承关系
            System.out.println("IO error");
        }finally {
            System.out.println("END");
        }

        try{
            process4();
        }catch (Exception e){
            e.printStackTrace();//调用栈中蓝字为我们的文件，灰色为源码
            System.out.println("NumberFormat");
        }

        try {
            process6(null);
        }catch (NullPointerException e){
//            throw new IllegalArgumentException();
            //抛出异常后，后面的代码不会继续执行
        }


        try{
            process7();
            System.out.println("p7");
        }catch (Exception e){
            e.printStackTrace();//看不到原来的异常信息了，只能看见最新的在哪抛出，因此可以把原始的Exception传入
        }

        //异常屏蔽
        try{
            Integer.parseInt("abc");
        }catch (Exception e){
            System.out.println("catched");
//            throw new RuntimeException(e);//只能抛出一个异常，finally覆盖掉了，屏蔽异常
        }finally {
            System.out.println("finally");
//            throw new IllegalArgumentException();
        }

        //那么如何保存所有异常信息？
        Exception origin = null;
        try{
            System.out.println(Integer.parseInt("abc"));
        }catch (Exception e){
            origin = e;
            throw e;
        }finally {
            Exception e = new IllegalArgumentException();
            if(origin != null) {
                e.addSuppressed(origin);
            }
            System.out.println(origin);
            throw e;
        }
    }

    public static void process1(){

        System.out.println("proceess1");

    }

    public static void process2(){
        System.out.println("proceess2");
    }

    public static void process3(){
        System.out.println("proceess3");
    }

    static void process4(){
        process5();
    }

    static void process5(){
        Integer.parseInt(null);
    }

    static void process6(String s){
        if(s == null){
//            NullPointerException e = new NullPointerException();
//            throw e;
            throw new NullPointerException();
        }
    }

    static void process7(){
        try{
            process8();
        }catch (NullPointerException e){
//            throw new IllegalArgumentException();
              System.out.println(e.getCause());//也可以使用该方法获取原始异常，若返回null则表示已经是根异常了
              throw new IllegalArgumentException(e);//传入原始异常，则可打印完整的调用栈
        }
    }

    static void process8(){
        throw new NullPointerException();
    }
}
