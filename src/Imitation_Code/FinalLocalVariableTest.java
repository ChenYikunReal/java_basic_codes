package Imitation_Code;

public class FinalLocalVariableTest{
	public void test(final int a){
		//���ܶ�final���ε��βθ�ֵ���������Ƿ�
		//a = 5;
	}
	public static void main(String[] args){
		//����final�ֲ�����ʱָ��Ĭ��ֵ����str�����޷����¸�ֵ
		final String str = "hello";
		//���渳ֵ���Ƿ�
		//str = "Java";
		//����final�ֲ�����ʱû��ָ��Ĭ��ֵ����d�������Ա���ֵһ��
		final double d;
		//��һ�θ�ֵ���ɹ���
		d = 5.6;
		//��final�����ظ���ֵ���������Ƿ�
		//d = 3.4;
	}
}