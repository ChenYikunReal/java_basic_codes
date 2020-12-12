package com.example;

import java.util.*;

public class Java9Collection {
    public static void main(String[] args) {
        // 创建一个包含4个元素的Set集合
        Set set = Set.of("Java", "Kotlin", "Go", "Swift");
        System.out.println(set);
        // 不可变集合，下面运行将导致运行时错误
        set.add("Ruby");
        // 创建一个包含4个元素的List集合
        List list = List.of(34, -25, 67, 231);
        System.out.println(list);
        // 不可变集合，下面运行将导致运行时错误
        list.remove(1);
        // 创建包含3个key-value对的Map集合
        Map map = Map.of("语文", 89, "数学", 95, "英语", 92);
        System.out.println(map);
        // 不可变集合，下面运行将导致运行时错误
        map.remove("语文");
        // 使用Map.entry()方法显式构建key-value对
        Map map2 = Map.ofEntries(Map.entry("语文", 89),
                Map.entry("数学", 95),
                Map.entry("英语", 92));
        System.out.println(map2);
    }

}