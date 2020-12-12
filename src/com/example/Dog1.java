package com.example;

public class Dog1{
    // 定义一个jump()方法
    public void jump(){
        System.out.println("正在执行jump方法");
    }
    // 定义一个run()方法，run()方法需要借助jump()方法
    public void run(){
        Dog1 d = new Dog1();
        d.jump();
        System.out.println("正在执行run方法");
    }
}