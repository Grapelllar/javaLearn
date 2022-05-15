package com.CoreClass;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(1024);
        for (int i = 0; i < 1000; i++) {
            sb.append(',');
            sb.append(i);
        }
        String s = sb.toString();
        System.out.println(s);

        //链式操作
        var sb2 = new StringBuilder(1024);
        sb.append("Mr")
                .append("Bob")
                .append("!")
                .insert(0,"Hello, ");
        System.out.println(sb2.toString());

        //链式计数器
        Adder adder = new Adder();
        adder.add(3)
                .add(5)
                .inc()
                .add(10);
        System.out.println(adder.value());

    }
}

//链式操作计数器构造，关键在不断调用this
class Adder{
    private int sum = 0;
    public Adder add(int n){
        sum += n;
        return this;
    }

    public Adder inc(){
        sum ++;
        return this;
    }

    public int value(){
        return sum;
    }
}