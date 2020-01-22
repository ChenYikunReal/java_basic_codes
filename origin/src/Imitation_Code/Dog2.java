package Imitation_Code;

public class Dog2{
	//定义一个jump()方法
	public void jump(){
		System.out.println("正在执行jump方法");
	}
	//定义一个run()方法，run()方法需要借助jump()方法
	public void run(){
		this.jump();
		System.out.println("正在执行run方法");
	}
}