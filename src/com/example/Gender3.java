package com.example;

public enum Gender3{
    // 此处的枚举值必须调用对应的构造器来构造
    MALE("男"), FEMALE("女");
    /*
    上面的两行代码相当于：
    public static final Gender MALE = new Gender("男");
    public static final Gender FEMALE = new Gender("女");
    */
    private final String name;
    // 枚举类的构造器只能使用private修饰
    private Gender3(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}