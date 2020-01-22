package Imitation_Code;
import java.util.Arrays;
public class ArraysTest {
	public static void main(String[] args){
		// ����һ��a1����
		int[] a1 = new int[]{3, 4 , 5, 6};
		// ����һ��a2����
		int[] a2 = new int[]{3, 4 , 5, 6};
		// a1�����a2����ĳ�����ȣ�ÿ��Ԫ��������ȣ������true
		System.out.println("a�����a2�����Ƿ���ȣ�" + Arrays.equals(a1 , a2));
		// ͨ������a1���飬����һ���µ�b����
		int[] b = Arrays.copyOf(a1, 6);
		System.out.println("a�����b�����Ƿ���ȣ�" + Arrays.equals(a1 , b));
		// ���b�����Ԫ�أ������[3, 4, 5, 6, 0, 0]
		System.out.println("b�����Ԫ��Ϊ��" + Arrays.toString(b));
		// ��b����ĵ�3��Ԫ�أ�����������5��Ԫ�أ�����������Ϊ1
		Arrays.fill(b , 2, 4 , 1);
		// ���b�����Ԫ�أ������[3, 4, 1, 1, 0, 0]
		System.out.println("b�����Ԫ��Ϊ��" + Arrays.toString(b));
		// ��b�����������
		Arrays.sort(b);
		// ���b�����Ԫ�أ������[0, 0, 1, 1, 3, 4]
		System.out.println("b�����Ԫ��Ϊ��" + Arrays.toString(b));
	}
}
