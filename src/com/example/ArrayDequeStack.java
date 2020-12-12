package com.example;

import java.util.*;

public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        // 依次将三个元素push入栈
        stack.push("高等数学");
        stack.push("线性代数");
        stack.push("离散数学");
        // 输出：[离散数学, 线性代数, 高等数学]
        System.out.println(stack);
        // 输出：离散数学
        System.out.println(stack.peek());
        // 输出：[离散数学, 线性代数, 高等数学]
        System.out.println(stack);
        // 输出：离散数学
        System.out.println(stack.pop());
        // 输出：[线性代数, 高等数学]
        System.out.println(stack);
    }

}