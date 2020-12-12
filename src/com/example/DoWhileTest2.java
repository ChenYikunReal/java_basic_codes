package com.example;

public class DoWhileTest2{
    public static void main(String[] args){
        int count2 = 1;
        do{
            System.out.println(count2 ++);
        }while (count2 < 10);
        System.out.println("循环结束！");
    }
}