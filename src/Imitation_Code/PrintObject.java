package Imitation_Code;

class Person3{
	private String name;
	public Person3(String name){
		this.name = name;
	}
}

public class PrintObject{
	public static void main(String[] args){
		//����һ��Person���󣬽�֮����p����
		Person3 p = new Person3("�����");
		//��ӡp�����õ�Person����
		System.out.println(p);
		//��������������ΪPerson@512ddf17���������ܲ�ͬ
		//������������ͬ��Ч����Ҳ����������ı���
		System.out.println(p.toString());
	}
}