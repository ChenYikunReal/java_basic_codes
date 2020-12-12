package com.example;

public class OutputFactory2{
    public Output getOutput(){
        return new BetterPrinter();
    }
    public static void main(String[] args){
        OutputFactory2 of = new OutputFactory2();
        Computer c = new Computer(of.getOutput());
        c.keyIn("程序设计基础");
        c.keyIn("面向对象程序设计基础");
        c.print();
    }
}