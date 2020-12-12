package com.example;

import java.util.*;


public class CollectionTest {
    public static void main(String[] args) {
        Collection<Object> c = new ArrayList<>();
        // 添加元素
        c.add("孙悟空");
        // 虽然Java集合里面不能存放基本类型的数值，但是Java支持自动装箱
        c.add(6);
        System.out.println("c集合的元素个数为：" + c.size());    // 输出2
        // 删除指定元素
        c.remove(6);
        System.out.println("c集合的元素个数为：" + c.size());    // 输出1
        // 判断是否包含指定的字符串
        System.out.println("c集合是否包含孙悟空字符串：" + c.contains("孙悟空"));    // 输出false
        c.add("高等数学");
        System.out.println("c集合里的元素" + c);
        Collection<String> books = new HashSet<>();
        books.add("高等数学");
        books.add("线性代数");
        System.out.println("c集合是否完全包含books集合？" +c.containsAll(books));        // 输出false
        // 用c集合减去books集合里面的元素
        c.removeAll(books);
        System.out.println("c集合里的元素：" + c);
        // 删除c集合里的全部元素
        c.clear();
        System.out.println("c集合里的元素：" + c);
        // 控制books集合里只剩下c集合里也包含的元素
        books.retainAll(c);
        System.out.println("books集合的元素：" + books);

    }

}