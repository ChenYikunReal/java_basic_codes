package Imitation_Code;

import java.util.*;

public class ListTest3 {
	public static void main(String[] args) {
		List books = new ArrayList();
		//��books��������ĸ�Ԫ��
		books.add(new String("�ߵ���ѧ���������ᣩ"));
		books.add(new String("���Դ�����ռ��������"));
		books.add(new String("��ɢ��ѧ���򻯰棩"));
		books.add(new String("������ۣ��������ѧ���֣�"));
		//ʹ��Ŀ������ΪComparator��Lambda���ʽ��List��������
		books.sort((o1, o2) -> ((String)o1).length() - ((String)o2).length());
		System.out.println(books);
		//ʹ��Ŀ������ΪUnaryOperator��Lambda���ʽ���滻�����е�����Ԫ��
		//��Lambda���ʽ����ʹ��ÿ���ַ����ĳ�����Ϊ�µļ���Ԫ��
		books.replaceAll(ele -> ((String)ele).length());
		System.out.println(books);
	}

}
