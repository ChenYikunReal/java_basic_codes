package Imitation_Code;

class Address1{
	String detail;
	public Address1(String detail){
		this.detail = detail;
	}
}
//ʵ��Cloneable�ӿ�
class User implements Cloneable{
	int age;
	Address1 address;
	public User(int age){
		this.age = age;
		address = new Address1("ɽ����̨");
	}
	//ͨ������super.clonr()ʵ��clone()����
	public User clone() throws CloneNotSupportedException{
		return(User)super.clone();
	}
}
public class CloneTest{
	public static void main(String[] args) throws CloneNotSupportedException{
		User u1 = new User(29);
		//clone�õ�u1����ĸ���
		User u2 = u1.clone();
		//�ж�u1��u2�Ƿ���ͬ
		System.out.println(u1 == u2);
		//�ж�u1��u2��ֵ�Ƿ���ͬ
		System.out.println(u1.address == u2.address);
	}
}