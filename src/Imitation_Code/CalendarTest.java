package Imitation_Code;

import java.util.*;

import static java.util.Calendar.*;

public class CalendarTest{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		//ȡ����
		System.out.println(c.get(YEAR));
		//ȡ����
		System.out.println(c.get(MONTH));
		//ȡ����
		System.out.println(c.get(DATE));
		//�ֱ������ꡢ�¡��ա�ʱ���֡���
		c.set(2019, 6, 8, 0, 0, 0);		//2019-6-8 00:00:00
		System.out.println(c.getTime());
		//��Calender����ǰ��һ��
		c.add(YEAR, -1);
		System.out.println(c.getTime());
		//��Calender����ǰ��8����
		c.add(MONTH, -8);
		System.out.println(c.getTime());
	}
}