package Imitation_Code;

import java.util.*;

public class SortTest {
	public static void main(String[] args) {
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);
		//��List����Ԫ�ش���ת
		Collections.reverse(nums);
		System.out.println(nums);
		//��List����Ԫ�ذ���Ȼ��������
		Collections.sort(nums);
		System.out.println(nums);
		//��list����Ԫ�ذ����˳������
		Collections.shuffle(nums);
		System.out.println(nums);
		
	}

}
