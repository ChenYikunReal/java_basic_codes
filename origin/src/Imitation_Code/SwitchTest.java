package Imitation_Code;

public class SwitchTest{
	public static void main(String[] args){
		//��������score����Ϊ�丳ֵΪ'C'
		char score = 'A';
		//ִ��switch��֧���
		switch(score){
			case 'A':
				System.out.println("��");
				break;
			case 'B':
				System.out.println("��");
				break;
			case 'C':
				System.out.println("��");
				break;
			case 'D':
				System.out.println("����");
				break;
			case 'E':
				System.out.println("������");
				break;
			default:
				System.out.println("�ɼ��������");
		}
	}
}