package com.example;

public class Gender2Test{
    public static void main(String[] args){
        Gender2 g = Gender2.valueOf("FEMALE");
        g.setName("女");
        System.out.println(g + "代表：" + g.getName());
        // 此时设置name值会提示参数错误
        // g.setName("男");
        // System.out.println(g + "代表：" + g.getName());
    }
}