package com.example;
import  java.lang.annotation.*;
// 使用@Retention指定注释保留到运行时
@Retention(RetentionPolicy.RUNTIME)
// 使用@Target指定被修饰的注解可用于修饰方法
@Target(ElementType.METHOD)
public @interface Testable {

}