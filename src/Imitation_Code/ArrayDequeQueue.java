package Imitation_Code;

import java.util.*;

public class ArrayDequeQueue {
	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<>();
		//���ν�����Ԫ�ؼ������
		queue.offer("�ߵ���ѧ");
		queue.offer("���Դ���");
		queue.offer("��ɢ��ѧ");
		//�����[�ߵ���ѧ, ���Դ���, ��ɢ��ѧ]
		System.out.println(queue);
		//���ʶ���ͷ����Ԫ�أ�����������poll������ջ��������ߵ���ѧ
		System.out.println(queue.peek());
		//�����[�ߵ���ѧ, ���Դ���, ��ɢ��ѧ]
		System.out.println(queue);
		//poll����һ��Ԫ�أ��ߵ���ѧ
		System.out.println(queue.poll());
		//�����[���Դ���, ��ɢ��ѧ]
		System.out.println(queue);
	}

}
