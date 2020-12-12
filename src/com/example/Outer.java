package com.example;

public class Outer{
    private int outProp = 9;
    class Inner{
        private int inProp = 5;
        public void accessOuterProp(){
            // 非静态内部类的成员可以直接访问外部类的private成员变量
            System.out.println("外部类的outProp值：" + outProp);
        }
    }
    public void accessInnerProp(){
        // 外部类不能直接访问非静态内部类的实例变量
        // 下面代码将出现编译错误
        // System.out.println("内部类的inProp值：" + inProp);
        // 如果需要访问内部类的实例变量，必须显式创建内部类对象
        System.out.println("内部变量的inProp值：" + new Inner().inProp);
    }
    public static void main(String[] args){
        // 执行下面代码，只创建了外部类对象，还未创建内部类对象
        Outer out = new Outer();
        out.accessInnerProp();
    }
}