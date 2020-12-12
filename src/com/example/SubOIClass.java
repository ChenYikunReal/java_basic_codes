package com.example;

public class SubOIClass extends Out1.In1{
    // 显示定义Subclass的构造器
    public SubOIClass(Out1 out){
        // 通过传入的Out对象显式调用In的构造器
        out.super("hello");
    }
}