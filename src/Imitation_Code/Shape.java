package Imitation_Code;

public abstract class Shape{
	{
		System.out.println("ִ��Shape�ĳ�ʼ���顭��");
	}
	private String color;
	//����һ�������ܳ��ĳ��󷽷�
	public abstract double calPerimeter();
	//����һ��������״�ĳ��󷽷�
	public abstract String getType();
	//����һ��Shape�Ĺ��������ù��������������ڴ���Shape���󣬶������ڱ��������
	public Shape() { }
	public Shape(String color){
		System.out.println("ִ��Shape�Ĺ���������");
		this.color = color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
}