package Imitation_Code;

import java.util.*;

public class LambdaArrays{
	public static void main(String[] args){
		String[] arr1 = new String[] {"java", "python", "c", "c++", "php"};
		Arrays.parallelSort(arr1, (o1, o2) -> o1.length() - o2.length());
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 19, 18, 17, 16, 15, 14, 13, 12, 11};
		//left代表数组中前一个索引处的元素，计算第一个元素时，left为1
		//right代表数组中当前索引处的元素
		Arrays.parallelPrefix(arr2, (left, right) -> left * right);
		System.out.println(Arrays.toString(arr2));
		long[] arr3 = new long[5];
		//operand代表正在计算的元素索引
		Arrays.parallelSetAll(arr3, operand -> operand * 5);
		System.out.println(Arrays.toString(arr3));
	}
}