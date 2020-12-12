package com.example;

class Apple1{
    // 定义info方法已过时
    // since属性指定从哪个版本开始，forRemoval指定该API何时被删除
    @Deprecated(since = "9", forRemoval = true)        public void info() {
        System.out.println("Apple的info方法...");
    }
}
public class DeprecatedTest {
    public static void main(String[] args) {
        // 下面使用info方法会被编译器警告
        new Apple1().info();
    }

}