package com.example;

import java.util.Scanner;

class Apple3{
    // 使用private修饰成员变量，将其隐藏起来
    private String color;
    private double weight;
    public Apple3(){    }

    // 提供有参数的构造器
    public Apple3(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setWeight(double weight){
        // 执行合理性校验，要求苹果质量必须在0~1kg之间
        if (weight > 1 || weight < 0){
            System.out.println("您设置的weight不合法");
            return;
        }else{
            this.weight = weight;
        }
    }

    public double getWeight(){
        return this.weight;
    }

    public String toString(){
        return "这样的一个苹果，color是：" + color + ", weight是：" + weight + "kg";
    }
}

public class ToStringTest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入Apple的color：");
        String color = scan.nextLine();
        System.out.println("请输入Apple的weight(单位:kg)：");
        double weight = scan.nextDouble();
        Apple3 a = new Apple3(color, weight);
        // 打印Apple对象
        System.out.println(a);
    }
}