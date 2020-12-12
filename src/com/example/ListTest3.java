package com.example;

import java.util.*;

public class ListTest3 {
    public static void main(String[] args) {
        List books = new ArrayList();
        // 向books集合添加四个元素
        books.add(new String("高等数学（上下两册）"));
        books.add(new String("线性代数与空间解析几何"));
        books.add(new String("离散数学（简化版）"));
        books.add(new String("物理概论（不含电磁学部分）"));
        // 使用目标类型为Comparator的Lambda表达式对List集合排序
        books.sort((o1, o2) -> ((String)o1).length() - ((String)o2).length());
        System.out.println(books);
        // 使用目标类型为UnaryOperator的Lambda表达式来替换集合中的所有元素
        // 该Lambda表达式控制使用每个字符串的长度作为新的集合元素
        books.replaceAll(ele -> ((String)ele).length());
        System.out.println(books);
    }

}