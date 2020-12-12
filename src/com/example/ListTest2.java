package com.example;

import java.util.*;

class D {
    public boolean equals(Object obj) {
        return true;
    }
}

public class ListTest2 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("高等数学"));
        books.add(new String("线性代数"));
        books.add(new String("离散数学"));
        System.out.println(books);
        // 删除集合中的A对象，将导致第一个元素被删除
        books.remove(new D());
        System.out.println(books);
        // 删除集合中的A对象，再次删除集合中的第一个元素
        books.remove(new D());
        System.out.println(books);
    }

}