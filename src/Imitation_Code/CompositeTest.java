package Imitation_Code;

class Animal{
	private void beat(){
		System.out.println("��������");
	}
	public void breathe(){
		beat();
		System.out.println("��һ��������һ�����������С���");
	}
}

class Bird{
	//��ԭ���ĸ�����ϵ����࣬��Ϊ�����һ����ϳɷ�
	private Animal a;
	public Bird(Animal a){
		this.a = a;
	}
	//���¶���һ���Լ���breathe()����
	public void breathe(){
		//ֱ�Ӹ���Animal�ṩ��breathe()������ʵ��Bird��breathe()����
		a.breathe();
	}
	public void fly(){
		System.out.println("����������ڵķ���");
	}
}

class Wolf{
	//��ԭ���ĸ�����ϵ����࣬��Ϊ�����һ����ϳɷ�
	private Animal a;
	public Wolf(Animal a){
		this.a = a;
	}
	//���¶���һ���Լ���breathe()����
	public void breathe(){
		//ֱ�Ӹ���Animal�ṩ��breathe()������ʵ��Wolf��breathe()����
		a.breathe();
	}
	public void run(){
		System.out.println("����½���Ͽ��ٱ��ܡ���");
	}
}

public class CompositeTest{
	public static void main(String[] args){
		//��ʱ��Ҫ��ʽ��������϶���
		System.out.println("����һֻСССС��");
		Animal a1 = new Animal();
		Bird b = new Bird(a1);
		b.breathe();
		b.fly();
		//��ʱ��Ҫ��ʽ��������϶���
		System.out.println("����һֻ�����");
		Animal a2 = new Animal();
		Wolf w = new Wolf(a2);
		w.breathe();
		w.run();
	}
}