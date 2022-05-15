package com.CoreClass;

public class PackingClass {
    public static void main(String[] args) {
        IntegerMe i1 = new IntegerMe(200);
        System.out.println(i1.getInteger());
        IntegerMe i2 = new IntegerMe(200);
        System.out.println(i1 == i2);
        int ii1 = 200;
        int ii2 = 200;
        System.out.println(ii1 == ii2);

        Integer n1 = new Integer(100);
        System.out.println(n1);

        Integer n2 = Integer.valueOf(200);
        System.out.println(n2);

        //自动装箱
        int a = 100;
        Integer a2 = Integer.valueOf(a); //静态工厂方法
        //自动拆箱
        int a3 = a2.intValue();
        Byte b = Byte.valueOf("1");
        //不变类
        Integer x = 127; //即Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);// true 因为对于较小的数节省内存，返回相同实例

        //进制转化
        System.out.println(Integer.parseInt("100",16));
        System.out.println(Integer.toString(100,36));

        //Java包装类静态变量
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        //最大最小值
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        //long类型占用的bit和byte
        int sizeOfLong = Long.SIZE;
        int bytesOfLong = Long.BYTES;

        //所有的整数和浮点数包装类都继承自Number,可以直接向上转型
        Number num = new Integer(999);
        byte b1 = num.byteValue();

        //Java没有无符号类型,可以如下处理
        byte b2 = -1; //二进制为 11111111
        byte b3 = 127;
        System.out.println(Byte.toUnsignedInt(b2));
        System.out.println(Byte.toUnsignedInt(b3));
    }
}

class IntegerMe{
    private int value;
    public IntegerMe(int value){
        this.value = value;
    }

    public int getInteger(){
        return value;
    }
}