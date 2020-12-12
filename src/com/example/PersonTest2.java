package com.example;

public class PersonTest2{
    public static void main(String[] args){
        Person4 p = new Person4();
        // 因为age成员变量已经被隐藏，所以下面语句将出现编译错误
        // p.age = 1000;
        // 下面的语句不会出现编译错误，但运行时会显示“您输入的年龄不合法”
        // 程序不会修改p的成员变量
        p.setAge(1000);
        // 访问p的age成员变量也必须要通过其对应的getter方法
        // 因为上面从未成功设置p的age成员变量，故此处输出0
        System.out.println("未能成功设置p的age成员变量时，age为：" + p.getAge());
        // 成功修改p的age成员变量
        p.setAge(30);
        // 因为上面成功设置了p的age成员变量，故此处输出30
        System.out.println("成功设置了p的age成员变量时，age为：" + p.getAge());
        // 不能直接操作p的age成员变量，只能通过其对应的setter方法
        // 因为”王小明”字符串长度满足2~6的条件，所以可以成功设置
        p.setName("王小明");
        System.out.println("成功设置了p的name成员变量时，age为：" + p.getName());
    }
}