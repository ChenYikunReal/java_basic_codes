package Imitation_Code;

import java.util.*;

public class LambdaArrays{
	public static void main(String[] args){
		String[] arr1 = new String[] {"java", "python", "c", "c++", "php"};
		Arrays.parallelSort(arr1, (o1, o2) -> o1.length() - o2.length());
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 19, 18, 17, 16, 15, 14, 13, 12, 11};
		//left����������ǰһ����������Ԫ�أ������һ��Ԫ��ʱ��leftΪ1
		//right���������е�ǰ��������Ԫ��
		Arrays.parallelPrefix(arr2, (left, right) -> left * right);
		System.out.println(Arrays.toString(arr2));
		long[] arr3 = new long[5];
		//operand�������ڼ����Ԫ������
		Arrays.parallelSetAll(arr3, operand -> operand * 5);
		System.out.println(Arrays.toString(arr3));
	}
}