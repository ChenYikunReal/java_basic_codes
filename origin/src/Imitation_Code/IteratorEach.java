package Imitation_Code;
import java.util.*;
public class IteratorEach {
	public static void main(String[] args) {
		//�������ϣ����Ԫ�صĲ�����ǰһ������һ��
		//����һ������
		Collection books = new HashSet();
		books.add("�ߵ���ѧ");
		books.add("���Դ���");
		books.add("��ɢ��ѧ");
		//��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		//ʹ��Lambda���ʽ��Ŀ��������Comsumer������������Ԫ��
		it.forEachRemaining(obj -> System.out.println("��������Ԫ��" + obj));
	}
}
