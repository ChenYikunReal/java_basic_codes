package Imitation_Code;

import java.util.*;

class D {
	public boolean equals(Object obj) {
		return true;
	}
}

public class ListTest2 {
	public static void main(String[] args) {
		List books = new ArrayList();
		books.add(new String("�ߵ���ѧ"));
		books.add(new String("���Դ���"));
		books.add(new String("��ɢ��ѧ"));
		System.out.println(books);
		//ɾ�������е�A���󣬽����µ�һ��Ԫ�ر�ɾ��
		books.remove(new D());
		System.out.println(books);
		//ɾ�������е�A�����ٴ�ɾ�������еĵ�һ��Ԫ��
		books.remove(new D());
		System.out.println(books);
	}

}
