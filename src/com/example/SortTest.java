package com.example;

import java.util.*;

public class SortTest {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);
        // 将List集合元素次序反转
        Collections.reverse(nums);
        System.out.println(nums);
        // 将List集合元素按自然排序排序
        Collections.sort(nums);
        System.out.println(nums);
        // 将list集合元素按随机顺序排序
        Collections.shuffle(nums);
        System.out.println(nums);
        
    }

}