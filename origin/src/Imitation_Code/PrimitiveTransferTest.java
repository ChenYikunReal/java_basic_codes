package Imitation_Code;

public class PrimitiveTransferTest{
	public static void swap(int a , int b){
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap�����a��ֵ�ǣ�" + a + "��b��ֵ�ǣ�" + b);
	}
	public static void main(String[] args){
		int a = 4;
		int b = 10;
		swap(a , b);
		System.out.println("���������Ժ�a��ֵ�ǣ�" + a + "��b��ֵ�ǣ�" + b);
	}
}