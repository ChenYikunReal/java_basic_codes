package com.example;

public class OverloadVarargs{
    public void test(String msg){
        System.out.println("只有一个字符串参数的test方法！");
    }
    // 因为前面已经有了一个test方法，test方法里面有一个字符串参数的形式
    // 此处的个数可变形参里不包括一个字符串参数的形式
    public void test(String...books){
        System.out.println("~~~****形参个数可变的test方法****~~~");
    }
    public static void main(String[] args){
        OverloadVarargs olv = new OverloadVarargs();
        // 下面将调用执行第二个test方法
        olv.test();
        olv.test("aa", "bb");
        olv.test("f", "*", "*", "k");
        // 下面将调用执行第一个方法
        olv.test("aa");
        // 第二个
        olv.test(new String[] {"aa"});
    }
}