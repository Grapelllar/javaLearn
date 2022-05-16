package com.Exception;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

public class JavaNullPointerException {
    public static void main(String[] args) {
        //尽量不要用null
        String s = null;
        //用空字符串初始化更安全
        String a = "";
//        System.out.println(s.toLowerCase());

        //错误做法:隐藏NullPointerException,应该在定义时做好初始化
//        try{
//            s.toLowerCase();
//        }catch (NullPointerException e){
//
//        }


//    public String[] readLinesFromFile(String file){
//
//    }

//    public Optional<String> readFromFile(String file){
//
//    }

        //查看null是谁
        Person p = new Person();
        System.out.println(p.address.city.toLowerCase());
    }

}

class Person {
    String[] name = new String[2];
    Address address = new Address();
}

class Address {
    String city;
    String street;
    String zipcode;
}