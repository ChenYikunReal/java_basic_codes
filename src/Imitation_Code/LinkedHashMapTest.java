package Imitation_Code;

import java.util.*;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("����", 124);
		scores.put("��ѧ", 107);
		scores.put("Ӣ��", 131);
		//����forEach()��������scores�������key-value��
		scores.forEach((key, value) -> System.out.println(key + "-->" + value));
		
	}

}
