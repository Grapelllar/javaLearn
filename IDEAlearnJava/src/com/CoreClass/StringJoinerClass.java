package com.CoreClass;

import java.util.StringJoiner;

public class StringJoinerClass {

    public static void main(String[] args) {
        //拼接字符串,用普通的String过于繁琐
        String[] names = {"Bob", "Alice", "Grace"};
        var sb = new StringBuilder();
        sb.append("Hello ");
        for(String name : names){
            sb.append(name).append(",");
        }
        sb.delete(sb.length() - 2,sb.length());
        sb.append("!");
        System.out.println(sb.toString());

        //使用StringJoiner
        var sj = new StringJoiner(",","Hello ","!");
        for(String name : names){
            sj.add(name);
        }
        System.out.println(sj.toString());

        //不需要指定开头结尾的时候，用 String.join 更方便,内部其实是调用了StringJoiner
        var s = String.join(",",names);
        System.out.println(s);
    }
}
