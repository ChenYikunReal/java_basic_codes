package Imitation_Code;

public class ForErrorTest{
	public static void main(String[] args){
		for (int count = 0; count < 10; count ++){
			System.out.println(count);
			//�ٴ��޸���ѭ������
			count *= 0.1;
		}
		System.out.println("ѭ������!");
	}
}