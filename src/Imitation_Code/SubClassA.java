package Imitation_Code;

class BaseClassA{
	public int a = 5;
}
public class SubClassA extends BaseClassA{
	public int a = 7;
	public void accessOwner(){
		System.out.println("�����a��ֵ�ǣ�" + a);
	}
	public void accessBase(){
		//ͨ��super���޶����ʴӸ���̳е���a����
		System.out.println("�����ǵĸ����a��ֵ�ǣ�" + super.a);
	}
	public static void main(String[] args){
		SubClassA sc = new SubClassA();
		sc.accessOwner();	//���7
		sc.accessBase();	//���5
	}
}