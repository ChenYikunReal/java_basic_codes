package Imitation_Code;

import java.util.*;


public class CollectionTest {
	public static void main(String[] args) {
		Collection<Object> c = new ArrayList<>();
		//���Ԫ��
		c.add("�����");
		//��ȻJava�������治�ܴ�Ż������͵���ֵ������Java֧���Զ�װ��
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��" +c.size());	//���2
		//ɾ��ָ��Ԫ��
		c.remove(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��" +c.size());	//���1	
		//�ж��Ƿ����ָ�����ַ���
		System.out.println("c�����Ƿ����\"�����\"�ַ�����" +c.contains("�����"));	//���false
		c.add("�ߵ���ѧ");
		System.out.println("c�������Ԫ��" + c);
		Collection<String> books = new HashSet<>();
		books.add("�ߵ���ѧ");
		books.add("���Դ���");
		System.out.println("c�����Ƿ���ȫ����books���ϣ�" +c.containsAll(books));		//���false
		//��c���ϼ�ȥbooks���������Ԫ��
		c.removeAll(books);
		System.out.println("c�������Ԫ�أ�" + c);
		//ɾ��c�������ȫ��Ԫ��
		c.clear();
		System.out.println("c�������Ԫ�أ�" + c);
		//����books������ֻʣ��c������Ҳ������Ԫ��
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ�أ�" + books);
		
	}

}
