package com.example;

@FunctionalInterface
interface Displayable{
    // 定义一个抽象方法和一个默认方法
    void display();
    default int add(int a, int b){
        return a+b;
    }
}

public class LambdaAndInner{
    private int age = 12;
    private static String name = "Chris Paul";
    public void test(){
        String book = "Paul Gorge";
        Displayable dis = () ->{
            // 访问"effectively final"的局部变量
            System.out.println("book局部变量为：" + book);
            // 访问外部类的实例变量和类变量
            System.out.println("外部类的age实例变量为：" + age);
            System.out.println("外部类的name类变量为：" + name);
        };
        dis.display();
        // 调用dis对象从接口中继承的add()方法
        System.out.println(dis.add(3, 5));
    }
    public static void main(String[] args){    
        LambdaAndInner lambda = new LambdaAndInner();
        lambda.test();
    }
}