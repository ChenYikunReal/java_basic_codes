package com.example;

public class GcTest1{
    public static void main(String[] args){
        for (int i = 0; i < 4; i ++){
            new GcTest1();
        }
    }
    public void finalize(){
        System.out.println("系统正在清理GcTest对象的资源……");
    }
}