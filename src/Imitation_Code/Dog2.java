package Imitation_Code;

public class Dog2{
	//����һ��jump()����
	public void jump(){
		System.out.println("����ִ��jump����");
	}
	//����һ��run()������run()������Ҫ����jump()����
	public void run(){
		this.jump();
		System.out.println("����ִ��run����");
	}
}