package Imitation_Code;

import java.util.*;

public class SearchTest {
	public static void main(String[] args) {
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums);
		System.out.println(Collections.max(nums));
		System.out.println(Collections.min(nums));
		//��nums�е�Ԫ��0��1�����
		Collections.replaceAll(nums, 0, 1);
		System.out.println(nums);
		//�ж�-5�ڼ����г��ֵĴ���������1
		System.out.println(Collections.frequency(nums, -5));
		//����
		Collections.sort(nums);
		System.out.println(nums);
		//����󣬲ſ����ö��ֲ��ҷ�����
		System.out.println(Collections.binarySearch(nums, 3));
	}

}
