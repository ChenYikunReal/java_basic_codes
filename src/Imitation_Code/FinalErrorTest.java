package Imitation_Code;

public class FinalErrorTest{
	//����һ��final���ε�ʵ������
	//ϵͳ�����final��Ա��������Ĭ�ϳ�ʼ��
	final int age;
	{
		//ageû�г�ʼ�������Դ˴����뽫��������
		//System.out.println(age);
		printAge();	//���д����ǺϷ��ģ��������0
		age = 6;
		System.out.println(age);
	}
	public void printAge(){
		System.out.println(age);
	}
	public static void main(String[] args){
		new FinalErrorTest();
	}
}