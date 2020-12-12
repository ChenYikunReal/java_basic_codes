package com.example;

class DataWrap1{
    int a;
    int b;
}

public class ReferenceTransferTest1{
    public static void swap(DataWrap1 dw){
        int tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        System.out.println("swap方法里，a的值是：" + dw.a + "；b的值是：" + dw.b);
        // 把dw直接赋值为null，让它不再指向任何有效地址！！！
        dw = null;
        // 显然，结果并未改变
        // System.out.println("swap方法里，a的值是：" + dw.a + "；b的值是：" + dw.b);
    }
    public static void main(String[] args){
        DataWrap1 dw = new DataWrap1();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("交换结束以后，a的值是：" + dw.a + "；b的值是：" + dw.b);
    }
}