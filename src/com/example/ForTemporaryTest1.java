package com.example;

public class ForTemporaryTest1{
    public static void main(String[] args){
        int tmp = 0;
        // 循环的初始化条件、循环条件、迭代语句都在下面一行
        for (int count = 0; count < 10; count ++){
            System.out.println(count);
            // 使用tmp来保存循环变量的值
            tmp = count;
        }
        System.out.println("循环结束！");
        System.out.println(tmp);
        System.out.println(tmp);
        System.out.println(tmp);
        System.out.println(tmp);
    }
}