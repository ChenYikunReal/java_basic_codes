package Imitation_Code;

import java.util.*;

public class EnumerationTest {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("�ߵ���ѧ");
		v.add("��ɢ��ѧ");
		Hashtable<String, Integer> scores = new Hashtable<>();
		scores.put("����", 124);
		scores.put("��ѧ", 107);
		Enumeration<String> em = v.elements();
		while (em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		Enumeration<String> keyEm = scores.keys();
		while (keyEm.hasMoreElements()) {
			Object key = keyEm.nextElement();
			System.out.println(key + "----->" +scores.get(key));
		}
	}

}
