package Imitation_Code;

import java.util.*;

public class HashMapErrorTest {
	public static void main(String[] args){
		HashMap ht = new HashMap();
		// �˴���A����ǰһ�������A����ͬһ����
		ht.put(new AAA(60000) , "���Java����");
		ht.put(new AAA(87563) , "������Java EE��ҵӦ��ʵս");
		// ���Hashtable��key Set���϶�Ӧ��Iterator������
		Iterator it = ht.keySet().iterator();
		// ȡ��Map�е�һ��key�����޸�����countֵ
		A first = (A)it.next();
		//����key���ܱ�׼ȷ����
		//first.count = 87563;   // ��
		// ���{A@1560b=���Java����, A@1560b=������Java EE��ҵӦ��ʵս}
		System.out.println(ht);
		// ֻ��ɾ��û�б��޸Ĺ���key����Ӧ��key-value��
		ht.remove(new AAA(87563));
		System.out.println(ht);
		// �޷���ȡʣ�µ�value���������д��붼�����null��
		System.out.println(ht.get(new AAA(87563)));   // �� ���null
		System.out.println(ht.get(new AAA(60000)));   // �� ���null
	}
}
