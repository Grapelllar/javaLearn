package com.CoreClass;

public class EnumsToString {
    public static void main(String[] args) {
        WeekdayToString day = WeekdayToString.SUN;
        if(day.dayValue == 6 || day.dayValue == 0){
            System.out.println("Today is " + day + "Work at home!");
        }else{
            System.out.println("Today is " + day + ".Work at office!");
        }
    }
}

enum WeekdayToString{
    MON(1, "����һ"), TUE(2, "���ڶ�"), WED(3, "������"), THU(4, "������"), FRI(5, "������"), SAT(6, "������"), SUN(0, "������");


    public final int dayValue;
    private final String chinese;

    private WeekdayToString(int dayValue, String chinese){
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    //ö��Ĭ�ϵ���toString,toString��name����һ����name���ܱ���д
    @Override
    public String toString(){
        return this.chinese;
    }
}