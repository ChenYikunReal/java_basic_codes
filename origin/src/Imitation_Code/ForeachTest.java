package Imitation_Code;
import java.util.*;
public class ForeachTest {
	public static void main(String[] args) {
		//�������ϣ����Ԫ�صĲ�����ǰһ������һ��
		//����һ������
		Collection books = new HashSet();
		books.add("�ߵ���ѧ");
		books.add("���Դ���");
		books.add("��ɢ��ѧ");
		for (Object obj : books) {
			//�˴���book����Ҳ���Ǽ��ϱ���
			String book = (String)obj;
			System.out.println(book);
			if (books.equals("��ɢ��ѧ")) {
				//���뽫����ConcurrentModificationException�쳣
				books.remove(book);
			}
		}
		System.out.println(books);
	}
}
