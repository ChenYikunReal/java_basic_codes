package com.example;

public class PrimitiveTransferTest{
    public static void swap(int a , int b){
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("swap方法里，a的值是：" + a + "；b的值是：" + b);
    }
    public static void main(String[] args){
        int a = 4;
        int b = 10;
        swap(a , b);
        System.out.println("交换结束以后，a的值是：" + a + "；b的值是：" + b);
    }
}