package Imitation_Code;

class BaseClassA{
	public int a = 5;
}
public class SubClassA extends BaseClassA{
	public int a = 7;
	public void accessOwner(){
		System.out.println("子类的a的值是：" + a);
	}
	public void accessBase(){
		//通过super来限定访问从父类继承到的a变量
		System.out.println("被覆盖的父类的a的值是：" + super.a);
	}
	public static void main(String[] args){
		SubClassA sc = new SubClassA();
		sc.accessOwner();	//输出7
		sc.accessBase();	//输出5
	}
}