package com.example;

class DataWrap{
    int a;
    int b;
}

public class ReferenceTransferTest{
    public static void swap(DataWrap dw){
        int tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        System.out.println("swap方法里，a的值是：" + dw.a + "；b的值是：" + dw.b);
    }
    public static void main(String[] args){
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("交换结束以后，a的值是：" + dw.a + "；b的值是：" + dw.b);
    }
}