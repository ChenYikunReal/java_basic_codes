package Imitation_Code;
import java.util.*;
public class IteratorErrorTest {
	public static void main(String[] args) {
		//�������ϣ����Ԫ�صĲ�����ǰһ������һ��
		//����һ������
		Collection books = new HashSet();
		books.add("�ߵ���ѧ");
		books.add("���Դ���");
		books.add("��ɢ��ѧ");
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while (it.hasNext()) {
			//it.next()�������ص�����������Object���ͣ������Ҫǿ������װ��
			String book = (String)it.next();
			System.out.println(book);
			if (book.contentEquals("��ɢ��ѧ")) {
				//ʹ��Iterator�����Ĺ����У������޸ļ���Ԫ�أ�������뽫�����쳣
				books.remove(book);
			}
		}
	}
}
