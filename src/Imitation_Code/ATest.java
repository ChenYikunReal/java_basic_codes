package Imitation_Code;

interface A{
	void test();
}
public class ATest{
	public static void main(String[] args){
		int age = 8;
		//������뽫���±������
		//����age�ֲ������������ڲ�������ˣ����age�൱�ڱ�final������
		//age = 2;
		A a = new A(){
			public void test(){
				//��Java8��ǰ������佫��ʾ����age����ʹ��final����
				//��Java8��ʼ�������ڲ��ࡢ�ֲ��ڲ���������ʷ�final�ľֲ�����
				System.out.println(age);
			}
		};
		a.test();
	}
}