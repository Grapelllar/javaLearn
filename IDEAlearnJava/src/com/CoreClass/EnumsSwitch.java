package com.CoreClass;

public class EnumsSwitch {
    public static void main(String[] args) {
        WeekdaySwitch day = WeekdaySwitch.SAT;
        switch (day){
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is " + day + " Work at office!");
                break;
//            case SAT:
            case SUN:
                System.out.println("Today is " + day + " Work at home!");
            break;
            default:
                //Â©Ð´Ä³¸öÊ±±¨´í
                throw new RuntimeException("cannot process" + day);
        }
    }
}

enum WeekdaySwitch{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}
