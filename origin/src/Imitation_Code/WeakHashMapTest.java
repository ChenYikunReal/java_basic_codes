package Imitation_Code;

import java.util.*;

public class WeakHashMapTest {
	public static void main(String[] args) {
		WeakHashMap whm = new WeakHashMap();
		//��WeakHashMap���������key-value��
		//����key-value�Զ��������ַ�������û���������ã�
		whm.put(new String("����"), new String("����"));
		whm.put(new String("��ѧ"), new String("����"));
		whm.put(new String("����"), new String("����"));
		//��WeakHashMap�����һ��key-value��
		//��key��һ��ϵͳ������ַ�������
		whm.put("��ѧ", new String("�е�"));
		//���whm�ַ������󣬽������ĸ�key-value��
		System.out.println(whm);
		//֪ͨϵͳ����������������
		System.gc();
		System.runFinalization();
		//����������£���ֻ����һ��key-value��
		System.out.println(whm);
	}

}
