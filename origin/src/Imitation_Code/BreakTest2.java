package Imitation_Code;

public class BreakTest2{
	public static void main(String[] args){
		//���ѭ����outer��Ϊ��ʶ��
		outer:
		for (int i = 0; i < 5; i ++){
			//�ڲ�ѭ��
			for (int j = 0; j < 3; j++){
				System.out.println("i��ֵΪ��" + i + "��j��ֵΪ��" + j);
				if (j ==1){
					//����outer��ʶ������ǵ�ѭ��
					break outer;
				}
			}
		}
	}
}