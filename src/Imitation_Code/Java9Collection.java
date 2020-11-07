package Imitation_Code;

import java.util.*;

public class Java9Collection {
	public static void main(String[] args) {
		//����һ������4��Ԫ�ص�Set����
		Set set = Set.of("Java", "Kotlin", "Go", "Swift");
		System.out.println(set);
		//���ɱ伯�ϣ��������н���������ʱ����
		set.add("Ruby");
		//����һ������4��Ԫ�ص�List����
		List list = List.of(34, -25, 67, 231);
		System.out.println(list);
		//���ɱ伯�ϣ��������н���������ʱ����
		list.remove(1);
		//��������3��key-value�Ե�Map����
		Map map = Map.of("����", 89, "��ѧ", 95, "Ӣ��", 92);
		System.out.println(map);
		//���ɱ伯�ϣ��������н���������ʱ����
		map.remove("����");
		//ʹ��Map.entry()������ʽ����key-value��
		Map map2 = Map.ofEntries(Map.entry("����", 89),
				Map.entry("��ѧ", 95),
				Map.entry("Ӣ��", 92));
		System.out.println(map2);
	}

}
