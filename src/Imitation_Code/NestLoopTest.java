package Imitation_Code;

public class NestLoopTest{
	public static void main(String[] args){
		//���ѭ��
		for (int i = 0; i < 5; i ++){
			//�ڲ�ѭ��
			for (int j = 0; j < 4; j ++){
				//���ڲ�ѭ��
				for (int k = 0; k < 3; k++){
					System.out.println("i��ֵ��" + i + "��j��ֵ��" + j +"��k��ֵ�ǣ�" + k);
				}
			}
		}
	}
}