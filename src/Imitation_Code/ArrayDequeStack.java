package Imitation_Code;

import java.util.*;

public class ArrayDequeStack {
	public static void main(String[] args) {
		ArrayDeque<String> stack = new ArrayDeque<>();
		//���ν�����Ԫ��push��ջ
		stack.push("�ߵ���ѧ");
		stack.push("���Դ���");
		stack.push("��ɢ��ѧ");
		//�����[��ɢ��ѧ, ���Դ���, �ߵ���ѧ]
		System.out.println(stack);
		//�������ɢ��ѧ
		System.out.println(stack.peek());
		//�����[��ɢ��ѧ, ���Դ���, �ߵ���ѧ]
		System.out.println(stack);
		//�������ɢ��ѧ
		System.out.println(stack.pop());
		//�����[���Դ���, �ߵ���ѧ]
		System.out.println(stack);
	}

}
