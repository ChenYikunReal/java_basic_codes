package com.example;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        // 成对放入多个key-value对
        map.put("高等数学", 100);
        map.put("离散数学", 100);
        map.put("物理概论", 100);
        // 多次放入的key-value对中value可以重复
        map.put("面向对象程序设计基础", 100);
        System.out.println(map);
        // 放入重复的key时，新的value会覆盖原有的value
        // 如果新的value覆盖了原有的value，该方法返回被覆盖的value
        System.out.println(map.put("离散数学", 99));    // 输出10
        System.out.println(map);    // 输出Map集合包含4个key-value对
        // 判断是否包含指定的key
        System.out.println("是否包含值为 离散数学 key：" + map.containsKey("离散数学"));    // 输出true
        // 判断是否包含指定的value
        System.out.println("是否包含值为 离散数学 value：" + map.containsValue(99));    // 输出true
        // 获取Map集合所有key组成的集合，通过遍历key来实现遍历所有的key-value对
        for (Object key : map.keySet()) {
            // map.get(key)方法获取指定的value
            System.out.println(key + "---->" + map.get(key));
        }
        // 根据keu来删除key-value对
        map.remove("面向对象程序设计基础");
        // 输出结果不再包含 面向对象程序设计基础=100 的key-value对
        System.out.println(map);
    }

}