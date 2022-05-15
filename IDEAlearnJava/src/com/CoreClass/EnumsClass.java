package com.CoreClass;
import java.util.Scanner;
public class EnumsClass {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        int day = 1;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("work at home");
        }else {
            System.out.println("work at school");
        }
        if(day == 7){
            System.out.println("nonono");
        }
        WeekdayEnum dayenum = WeekdayEnum.SUN;

//        Scanner s2 = new Scanner(System.in);
        String day2 = "SAT";
//        if(day2 == WeekdayEnum.SUN){
//            System.out.println("ok!");
//        } ERROR 类型不同，Enum是引用
        WeekdayEnum day3 = WeekdayEnum.SUN;
        if(day3 == WeekdayEnum.FRI){//因为enum类型的每个变量在JVM只有一个实例，所以可以直接==
        }

        //Enum的方法
        //返回常量名
        String n1 = WeekdayEnum.SUN.name();
        System.out.println(n1);
        //返回定义的顺序，从0计数
        System.out.println(WeekdayEnum.MON.ordinal());

        //防止Enum值改变
        WeekdayEnumIndex index = WeekdayEnumIndex.SUN;
    }
}



//enum定义枚举类
enum WeekdayEnum{
    SUN,MON,TUE,WED,THU,FRI,SAT;
}

//为防止enum顺序被改变，可以如下定义
enum WeekdayEnumIndex{
    MON(1),TUE(2),WED(3),THU(4),FRI(5),SAT(6),SUN(0);

    public final int dayValue;

    private WeekdayEnumIndex(int dayValue){
        this.dayValue = dayValue;
    }
}

class Weekday {
    public static final int SUN = 0;
    public static final int MON = 1;
    public static final int TUE = 2;
    public static final int WED = 3;
    public static final int THU = 4;
    public static final int FRI = 5;
    public static final int SAT = 6;
}