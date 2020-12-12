package com.example;

public class NestLoopTest{
    public static void main(String[] args){
        // 外层循环
        for (int i = 0; i < 5; i ++){
            // 内层循环
            for (int j = 0; j < 4; j ++){
                // 最内层循环
                for (int k = 0; k < 3; k++){
                    System.out.println("i的值：" + i + "，j的值：" + j +"，k的值是：" + k);
                }
            }
        }
    }
}