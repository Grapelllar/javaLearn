package com.CoreClass;

public class RecordClass {
    public static void main(String[] args) {
        Point p = new Point(-123,456);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);

        var z = PointConstructor.of();
        var p2 = PointConstructor.of(123,456);
//        PointConstructor p2 = new PointConstructor(-123,456);
    }
}

record Point(int x, int y){}

record PointConstructor(int x, int y){
    public PointConstructor{
        if(x < 0 || y < 0){
            throw new IllegalArgumentException();
        }
    }

    public static Point of(){
        return new Point(0 , 0);
    }

    public static Point of(int x, int y){
        return new Point(x,y);
    }
}


