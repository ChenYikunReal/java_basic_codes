package com.example;

public class Fruit {
    public void info() {
        System.out.println("水果的一般info方法...");
    }
}

class Apple2 extends Fruit{
    // 使用@Override指定下面的方法必须重写父类方法
    @Override
    public void info() {
        System.out.println("苹果重写水果的一般info方法...");
    }
}