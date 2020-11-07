package Imitation_Code;

import java.util.*;

class AAA {
	int count;
	public AAA(int count) {
		this.count = count;
	}
	//����count��ֵ���ж����������Ƿ����
	public boolean equals(Object obj) {
		if (obj == this) 
			return true;
		if (obj != null && obj.getClass() == AAA.class) {
			AAA a = (AAA)obj;
			return this.count == a.count;
		}
		return false;
	}
	//����count��ֵ������hashCode��ֵ
	public int hashCode() {
		return this.count;
	}
}

class BBB{
	//��дequals()������B�������κζ���ͨ��equals()�����Ƚ϶�����true
	public boolean equals(Object obj) {
		return true;
	}
}

public class HashtableTest {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new AAA(60000), "�ߵ���ѧ");
		ht.put(new AAA(87563), "���Դ���");
		ht.put(new AAA(1232), "��ɢ��ѧ");
		System.out.println(ht);
		//ֻҪ��������ͨ��equals()�����ȽϷ���true��Hashtable����Ϊ��������ȵ�value
		//����Hashtableֻ��һ��B���������κζ���ͨ��equals()�����Ƚ϶���ȣ������������true
		System.out.println(ht.containsValue("�����ַ���"));	//���true
		//ֻҪ���������count��ȣ�����ͨ��equals()�����ȽϷ���true����hashCodeֵ���
		//Hashtable����Ϊ��������ȵ�key�������������true
		System.out.println(ht.containsKey(new AAA(87563)));	//���true
		//����������ɾ�����һ��key-value��
		ht.remove(new AAA(1232));
		System.out.println(ht);
	}

}
