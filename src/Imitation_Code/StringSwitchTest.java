package Imitation_Code;

public class StringSwitchTest{
	public static void main(String[] args){
		//��������season
		String season = "summer";
		//ִ��switch��֧���
		switch (season){
			case "spring":
				System.out.println("��ů��������");
				break;
			case "summer":
				System.out.println("�������ס���");
				break;
			case "autumn":
				System.out.println("�����ˬ����");
				break;
			case "winter":
				System.out.println("��ѩ��������");
				break;
			default:
				System.out.println("�����������");
		}
	}
}