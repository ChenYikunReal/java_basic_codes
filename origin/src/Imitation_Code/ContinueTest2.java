package Imitation_Code;

public class ContinueTest2{
	public static void main(String[] args){
		//���ѭ����outer��Ϊ��ʶ��
		outer:
		for (int i = 0; i < 8; i ++){
			if (i ==4){
				//���Ա���ѭ��ʣ�µ����
				continue outer;
				
			}
			System.out.println("continue����������");
			//�ڲ�ѭ��
			for (int j = 0; j < 3; j++){
				System.out.println("i��ֵΪ��" + i + "��j��ֵΪ��" + j);
				if (j ==1){
					//����outer��ǩ��ָ���ĵ�ѭ���б���ѭ����ʣ�µ����
					continue outer;
				}
			}
		}
	}
}