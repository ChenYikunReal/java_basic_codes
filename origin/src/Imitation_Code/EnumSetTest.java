package Imitation_Code;

import java.util.*;

public class EnumSetTest {
	public static void main(String[] args) {
		//����һ��EnumSet���ϣ�����Ԫ�ؾ���Seasonö�����ȫ��ö��ֵ
		EnumSet<Season> es1 = EnumSet.allOf(Season.class);
		System.out.println(es1);
		//����һ��EnumSet�ռ��ϣ�ָ�����е�Ԫ����season���ö��ֵ
		EnumSet<Season> es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2);
		//�ֶ��������Ԫ��
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		System.out.println(es2);
		//��ָ��ö��ֵ����EnumSet����
		EnumSet<Season> es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
		System.out.println(es3);		
		EnumSet<Season> es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println(es4);
		//�´�����EnumSet����Ԫ�غ�es4����Ԫ������ͬ������
		//es5����Ԫ��+es4����Ԫ��=Seasonö�����ȫ��ö��ֵ
		EnumSet<Season> es5 = EnumSet.complementOf(es4);
		System.out.println(es5);
	}

}
