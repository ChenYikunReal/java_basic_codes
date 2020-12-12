package com.example;
@FunctionalInterface
public interface FunInterface {
    static void foo() {
        System.out.println("foo类方法");
    }
    default void bar() {
        System.out.println("bar默认方法");
    }
    void test();    // 只定义一个抽象方法
    // void abc();    // 不能继续定义了
}