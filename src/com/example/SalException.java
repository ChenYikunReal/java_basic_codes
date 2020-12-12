package com.example;

public class SalException extends Exception{
    public SalException() {}
    public SalException(String msg) {
        super(msg);
    }
    // 创建一个可以接收Throwable参数的构造器
    public SalException(Throwable t) {
        super(t);
    }

}

// 这样一个业务异常类可以用来封装原始异常，从而实现对异常的链式处理