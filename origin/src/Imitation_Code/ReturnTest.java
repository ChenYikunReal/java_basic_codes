package Imitation_Code;

public class ReturnTest{
	public static void main(String[] args){
		//һ���򵥵�forѭ��
		for (int i = 0; i < 10; i++){
			System.out.println("i��ֵΪ��" + i);
			if (i == 4){
				return;
			}
			System.out.println("return���������");
		}
	}
}