package Imitation_Code;

class Creature{
	public Creature(){
		System.out.println("Creature���޲����Ĺ�����");
	}
}

class Animal1 extends Creature{
	public Animal1(String name){
		System.out.println("Animal�Ĵ�һ�������Ĺ�����" + "�ö����nameΪ" + name);
	}
	public Animal1(String name , int age){
		//ʹ��this����ͬһ�����صĹ�����
		this(name);
		System.out.println("Animal�Ĵ����������Ĺ�����" + "��ageΪ" +age);
	}
}

public class Wolf1 extends Animal1{
	public Wolf1(){
		//��ʾ���ø��������������Ĺ�����
		super("��̫��", 3);
		System.out.println("Wolf�޲����Ĺ�����");
	}
	public static void main(String[] args){
		new Wolf1();
	}
}