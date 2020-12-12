package com.example;

class Creature{
    public Creature(){
        System.out.println("Creature的无参数的构造器");
    }
}

class Animal1 extends Creature{
    public Animal1(String name){
        System.out.println("Animal的带一个参数的构造器" + "该动物的name为" + name);
    }
    public Animal1(String name , int age){
        // 使用this调用同一个重载的构造器
        this(name);
        System.out.println("Animal的带两个参数的构造器" + "其age为" +age);
    }
}

public class Wolf1 extends Animal1{
    public Wolf1(){
        // 显示调用父类有两个参数的构造器
        super("灰太狼", 3);
        System.out.println("Wolf无参数的构造器");
    }
    public static void main(String[] args){
        new Wolf1();
    }
}