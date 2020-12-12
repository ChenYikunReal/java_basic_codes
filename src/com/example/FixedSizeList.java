package com.example;

import java.util.*;

public class FixedSizeList {
    public static void main(String[] args) {
        List fixedList = Arrays.asList("高等数学", "线性代数");
        // 获取fixedList的实现类，将输出Arrays$ArrayList
        System.out.println(fixedList.getClass());
        // 使用方法遍历集合
        fixedList.forEach(System.out::println);
        // 试图增加、删除元素都会引发UnsupporttedOperationException异常
        fixedList.add("离散数学");
        fixedList.remove("高等数学");
    }

}