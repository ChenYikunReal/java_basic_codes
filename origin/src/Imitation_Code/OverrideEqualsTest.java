package Imitation_Code;

//����һ��Person��
class Person5{
	//��дequals()�������ṩ�Զ������ȱ�׼
	public boolean equals(Object obj){
		//�����жϣ����Ƿ���true����Person�������κζ������
		return true;
	}
}

//����һ��Dog����
class Dog{}

public class OverrideEqualsTest{
	public static void main(String[] args){
		Person5 p = new Person5();
		System.out.println("Person�����Ƿ�equals Dog����" + p.equals(new Dog()));
		System.out.println("Person�����Ƿ�equals String����" + p.equals(new String("Hello")));
	}
}