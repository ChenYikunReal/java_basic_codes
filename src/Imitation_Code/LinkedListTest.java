package Imitation_Code;

import java.util.*;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList books = new LinkedList();
		//���ַ���Ԫ����ӵ����е�β��
		books.offer("�ߵ���ѧ");
		//��һ���ַ���Ԫ����ӵ�ջ�Ķ���
		books.push("���Դ���");
		//���ַ���Ԫ����ӵ����е�ͷ�����൱��ջ�Ķ�����
		books.offerFirst("��ɢ��ѧ");
		//��List�ķ�ʽ�����������ʵķ�ʽ������������Ԫ��
		for (int i = 0; i < books.size(); i++) {
			System.out.println("�����У�" + books.get(i));
		}
		//���ʲ���ɾ��ջ����Ԫ��
		System.out.println(books.peekFirst());
		//���ʲ���ɾ�����е����һ��Ԫ��
		System.out.println(books.peekLast());
		//��ջ����Ԫ�ص���ջ
		System.out.println(books.pop());
		//������������������е�һ��Ԫ�ر�ɾ��
		System.out.println(books);
		//���ʲ�ɾ�����е����һ��Ԫ��
		System.out.println(books.pollLast());
		//���������[���Դ���]
		System.out.println(books);
	}

}
