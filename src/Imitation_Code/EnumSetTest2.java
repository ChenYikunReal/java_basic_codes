package Imitation_Code;

import java.util.*;

public class EnumSetTest2 {
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.clear();
		c.add(Season.AUTUMN);
		c.add(Season.SPRING);
		//����Collection�����е�����Ԫ��������EnumSet����
		EnumSet enumSet = EnumSet.copyOf(c);
		System.out.println(enumSet);
		c.add("�ߵ���ѧ");
		c.add("��ɢ��ѧ");
		//�����������쳣����Ϊc�������Ԫ�ز���ȫ����Ϊö��ֵ
		enumSet = EnumSet.copyOf(c);
	}

}
