package Imitation_Code;

import java.util.*;

public class CollectionEach {
	public static void main(String[] args) {
		//����һ������
		Collection<String> books = new HashSet<>();
		books.add("�ߵ���ѧ");
		books.add("���Դ���");
		books.add("��ɢ��ѧ");
		//����forEach()������������
		books.forEach(obj -> System.out.println("��������Ԫ�أ�" + obj));
	}

}
