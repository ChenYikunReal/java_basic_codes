package Imitation_Code;

public class Print{
	public static void main(String[] args){
		//һ���򵥵�forѭ��
		for (int i = 0; i < 10; i++){
			System.out.println("i��ֵΪ��" + i);
			if (i == 5){
				//���Ա���ѭ��ʣ�µ����
				continue;
			}
			if (i == 6){
				//���Ա���ѭ��ʣ�µ����
				continue;
			}
			System.out.print("continue����������");
		}
	}
}