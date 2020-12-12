package com.example;

import java.util.*;

public class SearchTest {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
        // 将nums中的元素0用1来替代
        Collections.replaceAll(nums, 0, 1);
        System.out.println(nums);
        // 判断-5在集合中出现的次数，返回1
        System.out.println(Collections.frequency(nums, -5));
        // 排序
        Collections.sort(nums);
        System.out.println(nums);
        // 排序后，才可以用二分查找法查找
        System.out.println(Collections.binarySearch(nums, 3));
    }

}