package Imitation_Code;
import java.util.*;
public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet books = new LinkedHashSet();
		books.add("�ߵ���ѧ");
		books.add("��ɢ��ѧ");
		System.out.println(books);
		//ɾ�����ߵ���ѧ��
		books.remove("�ߵ���ѧ");
		//������ӡ��ߵ���ѧ��
		books.add("�ߵ���ѧ");
		System.out.println(books);
	}

}
