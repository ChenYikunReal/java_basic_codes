package com.example;

public class SwitchTest{
    public static void main(String[] args){
        // 声明变量score，并为其赋值为'C'
        char score = 'A';
        // 执行switch分支语句
        switch(score){
            case 'A':
                System.out.println("优");
                break;
            case 'B':
                System.out.println("良");
                break;
            case 'C':
                System.out.println("中");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'E':
                System.out.println("不及格");
                break;
            default:
                System.out.println("成绩输入错误！");
        }
    }
}