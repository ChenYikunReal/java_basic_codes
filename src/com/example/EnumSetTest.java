package com.example;

import java.util.*;

public class EnumSetTest {
    public static void main(String[] args) {
        // 创建一个EnumSet集合，集合元素就是Season枚举类的全部枚举值
        EnumSet<Season> es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);
        // 创建一个EnumSet空集合，指定其中的元素是season类的枚举值
        EnumSet<Season> es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2);
        // 手动添加两个元素
        es2.add(Season.WINTER);
        es2.add(Season.SPRING);
        System.out.println(es2);
        // 以指定枚举值创建EnumSet集合
        EnumSet<Season> es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
        System.out.println(es3);        
        EnumSet<Season> es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(es4);
        // 新创建的EnumSet集合元素和es4集合元素有相同的类型
        // es5集合元素+es4集合元素=Season枚举类的全部枚举值
        EnumSet<Season> es5 = EnumSet.complementOf(es4);
        System.out.println(es5);
    }

}