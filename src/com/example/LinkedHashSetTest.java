package com.example;
import java.util.*;
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet books = new LinkedHashSet();
        books.add("高等数学");
        books.add("离散数学");
        System.out.println(books);
        // 删除“高等数学”
        books.remove("高等数学");
        // 重新添加“高等数学”
        books.add("高等数学");
        System.out.println(books);
    }

}