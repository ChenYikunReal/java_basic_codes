package Imitation_Code;

import java.util.*;

public class ListTest {
	public static void main(String[] args) {
		List books = new ArrayList();
		//��books�������������Ԫ��
		books.add(new String("�ߵ���ѧ"));
		books.add(new String("���Դ���"));
		books.add(new String("��ɢ��ѧ"));
		System.out.println(books);
		//�����ַ�����������ڵڶ���λ��
		books.add(1, new String("�������"));
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		//ɾ��������Ԫ��
		books.remove(2);
		System.out.println(books);
		//�ж�ָ��Ԫ����List�����е�λ�ã����1������λ�ڵ�2λ
		System.out.println(books.indexOf(new String("�������")));
		//���ڶ���Ԫ���滻���µ��ַ�������
		books.set(1, new String("���Դ���"));
		System.out.println(books);
		//��books���ϵĵڶ���Ԫ�أ���������������Ԫ�ؽ�ȡ���Ӽ���
		System.out.println(books.subList(1, 2));
	}

}
