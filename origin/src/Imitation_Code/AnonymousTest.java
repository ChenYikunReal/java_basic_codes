package Imitation_Code;

interface Product1{
	public double getPrice();
	public String getName();
}

public class AnonymousTest{
	public void test (Product1 p){
		System.out.println("������һ��" +p.getName() + "��������" + p.getPrice());
	}
	public static void main(String[] args){
		AnonymousTest ta = new AnonymousTest();
		//����test()����ʱ����Ҫ����һ��Product����
		//�˴�����������ʵ�����ʵ��
		ta.test(new Product1(){
			public double getPrice(){
				return 567.80;
			}
			public String getName(){
				return "AGP�Կ�";
			}
		});
	}
}