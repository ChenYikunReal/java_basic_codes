package Imitation_Code;

import java.util.*;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		//�������������pq������ĸ�Ԫ��
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		//���pq���У������ǰ���Ԫ�ؼ����˳������
		System.out.println(pq);
		//���ʶ��еĵ�һ��Ԫ�أ���ʵ���Ƕ��е���СԪ��-3
		System.out.println(pq.poll());
	}

}
