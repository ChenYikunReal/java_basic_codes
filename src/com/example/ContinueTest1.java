package com.example;

public class ContinueTest1{
    public static void main(String[] args){
        // 一个简单的for循环
        for (int i = 0; i < 10; i++){
            System.out.println("i的值为：" + i);
            if (i == 5){
                // 忽略本次循环剩下的语句
                continue;
            }
            if (i == 6){
                // 忽略本次循环剩下的语句
                continue;
            }
            System.out.println("continue后输出的语句");
        }
    }
}