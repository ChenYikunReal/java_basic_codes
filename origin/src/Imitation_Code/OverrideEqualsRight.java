package Imitation_Code;

class Person2{
	private String name;
	private String idStr;

	public Person2(){ }

	public Person2(String name, String idStr){
		this.name = name;
		this.idStr = idStr;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setIdStr(String idStr){
		this.idStr = idStr;
	}

	public String getIdStr(){
		return this.idStr;
	}

	//��дequals()�������ṩ�Զ������ȱ�׼
	public boolean equals(Object obj){
		//�������������ͬһ������
		if (this == obj)
			return true;
		//ֻ�е�obj��Person2�Ķ���
		if ((obj != null) && (obj.getClass() == Person2.class)){
			Person2 person2Obj = (Person2)obj;
			//���ҵ�ǰ�����idStr��obj�����idStr���ʱ�ſ����ж������������
			if (this.getIdStr().equals(person2Obj.getIdStr())){
				return true;
			}
		}
		return false;
	}
}

public class OverrideEqualsRight{
	public static void main(String[] args){
		Person2 p1 = new Person2("�����", "12343433433");
		Person2 p2 = new Person2("������", "12343433433");
		Person2 p3 = new Person2("����", "99933433");
		//p1��p2��idStr��ȣ��������true
		System.out.println("p1��p2�Ƿ���ȣ�" + p1.equals(p2));
		//p2��p3��idStr����ȣ��������false
		System.out.println("p2��p3�Ƿ���ȣ�" + p2.equals(p3));
	}
}
	