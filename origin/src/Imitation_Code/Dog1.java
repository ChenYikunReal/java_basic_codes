package Imitation_Code;

public class Dog1{
	//����һ��jump()����
	public void jump(){
		System.out.println("����ִ��jump����");
	}
	//����һ��run()������run()������Ҫ����jump()����
	public void run(){
		Dog1 d = new Dog1();
		d.jump();
		System.out.println("����ִ��run����");
	}
}