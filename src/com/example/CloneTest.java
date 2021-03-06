package com.example;

class Address1{
    String detail;
    public Address1(String detail){
        this.detail = detail;
    }
}
// 实现Cloneable接口
class User implements Cloneable{
    int age;
    Address1 address;
    public User(int age){
        this.age = age;
        address = new Address1("山东烟台");
    }
    // 通过调用super.clonr()实现clone()方法
    public User clone() throws CloneNotSupportedException{
        return(User)super.clone();
    }
}
public class CloneTest{
    public static void main(String[] args) throws CloneNotSupportedException{
        User u1 = new User(29);
        // clone得到u1对象的副本
        User u2 = u1.clone();
        // 判断u1、u2是否相同
        System.out.println(u1 == u2);
        // 判断u1、u2的值是否相同
        System.out.println(u1.address == u2.address);
    }
}