package com.example;

import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        // 下面代码依次向pq中添加四个元素
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        // 输出pq队列，并不是按照元素加入的顺序排列
        System.out.println(pq);
        // 访问队列的第一个元素，其实就是队列的最小元素-3
        System.out.println(pq.poll());
    }

}