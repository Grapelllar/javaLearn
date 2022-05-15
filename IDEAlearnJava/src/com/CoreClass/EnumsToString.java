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
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");


    public final int dayValue;
    private final String chinese;

    private WeekdayToString(int dayValue, String chinese){
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    //枚举默认调用toString,toString和name返回一样但name不能被覆写
    @Override
    public String toString(){
        return this.chinese;
    }
}