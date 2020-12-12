package com.example;
import java.util.*;
public class IteratorEach {
    public static void main(String[] args) {
        // 创建集合，添加元素的操作与前一个程序一样
        // 创建一个集合
        Collection books = new HashSet();
        books.add("高等数学");
        books.add("线性代数");
        books.add("离散数学");
        // 获取books集合对应的迭代器
        Iterator it = books.iterator();
        // 使用Lambda表达式（目标类型是Comsumer）来遍历集合元素
        it.forEachRemaining(obj -> System.out.println("迭代集合元素" + obj));
    }
}