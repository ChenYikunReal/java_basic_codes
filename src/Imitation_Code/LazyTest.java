package Imitation_Code;

import java.util.*;

import static java.util.Calendar.*;

public class LazyTest{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		//�����YEAR�ֶ�+1��MONTH�ֶ�Ϊ1��2�£�
		cal.set(2003, 7, 31);
		System.out.println(cal.getTime());
		//���·�����Ϊ9����9��31�ղ����ڣ���������޸ģ�cal����ϵͳ�Զ�������10��1��
		cal.set(MONTH, 8);
		//�����10��1��
		System.out.println(cal.getTime());
		//����DATE�ֶ�Ϊ5
		cal.set(DATE, 5);
		System.out.println(cal.getTime());
	}
}