package Imitation_Code;

import java.util.*;

public class ArrayDequeQueue {
	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<>();
		//依次将三个元素加入队列
		queue.offer("高等数学");
		queue.offer("线性代数");
		queue.offer("离散数学");
		//输出：[高等数学, 线性代数, 离散数学]
		System.out.println(queue);
		//访问队列头部的元素，但并不将其poll出队列栈，输出：高等数学
		System.out.println(queue.peek());
		//输出：[高等数学, 线性代数, 离散数学]
		System.out.println(queue);
		//poll出第一个元素：高等数学
		System.out.println(queue.poll());
		//输出：[线性代数, 离散数学]
		System.out.println(queue);
	}

}
