package Imitation_Code;

public class FinalVariableTest{
	//�����Ա����ʱָ��Ĭ��ֵ���Ϸ�
	final int a = 6;
	//����������ڹ��������ʼ�����з����ֵ
	final String str;
	final int c;
	final static double d;
	//��û��ָ��Ĭ��ֵ��Ҳû���ڳ�ʼ���顢��������ָ����ֵ
	//���涨���chʵ�������ǲ��Ϸ���
	//final char ch;
	//��ʼ���飬���Զ�û��ָ��Ĭ��ֵ��ʵ������ָ����ʼֵ
	{
		//�ڳ�ʼ������Ϊʵ������ָ����ʼֵ����ȥ
		str = "Hello";
		//����aʵ������ʱ�Ѿ�ָ����Ĭ��ֵ
		//����Ϊa�������¸�ֵ,�����������Ƿ�
		//a = 9;
	}
	//��̬��ʼ���飬���Զ�û��ָ��Ĭ��ֵ�������ָ����ʼֵ
	static{
		//�ھ�̬��ʼ������Ϊ�����ָ����ʼֵ
		d = 5.6;
	}
	//�����������ԶԼ�û��ָ��Ĭ��ֵ��Ҳû���ڳ�ʼ������ָ����ʼֵ��ʵ������ָ����ʼֵ
	public FinalVariableTest(){
		//����ڳ�ʼ�������Ѿ���strָ���˳�ʼֵ����ô�ڹ������в��ܶ�final�������¸�ֵ������ĸ�ֵ���Ƿ�
		//str = "java";
		c = 5;
	}
	public void changeFinal(){
		//��ͨ��������Ϊfinal���εĳ�Ա������ֵ
		//d = 1.2;
		//��������ͨ������Ϊfinal��Ա����ָ����ʼֵ
		//ch = 'a';
	}
	public static void main(String[] args){
		FinalVariableTest ft = new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
	}
}