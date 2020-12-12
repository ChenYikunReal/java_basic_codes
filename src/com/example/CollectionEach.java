package com.example;

import java.util.*;

public class CollectionEach {
    public static void main(String[] args) {
        // 创建一个集合
        Collection<String> books = new HashSet<>();
        books.add("高等数学");
        books.add("线性代数");
        books.add("离散数学");
        // 调用forEach()方法遍历集合
        books.forEach(obj -> System.out.println("迭代集合元素：" + obj));
    }

}