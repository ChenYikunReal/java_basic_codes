package com.example;

public class NullAccessStatic{
    private static void test(){
        System.out.println("static修饰的类方法");
    }
    public static void main(String[] args){
        // 定义一个NullAccessStatic变量，其值为null
        NullAccessStatic nas = null;
        // 使用null对象调用所属类的静态方法
        nas.test();
    }
}