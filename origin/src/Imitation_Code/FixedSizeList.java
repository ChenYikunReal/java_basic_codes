package Imitation_Code;

import java.util.*;

public class FixedSizeList {
	public static void main(String[] args) {
		List fixedList = Arrays.asList("�ߵ���ѧ", "���Դ���");
		//��ȡfixedList��ʵ���࣬�����Arrays$ArrayList
		System.out.println(fixedList.getClass());
		//ʹ�÷�����������
		fixedList.forEach(System.out::println);
		//��ͼ���ӡ�ɾ��Ԫ�ض�������UnsupporttedOperationException�쳣
		fixedList.add("��ɢ��ѧ");
		fixedList.remove("�ߵ���ѧ");
	}

}
