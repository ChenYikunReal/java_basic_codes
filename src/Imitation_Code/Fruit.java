package Imitation_Code;

public class Fruit {
	public void info() {
		System.out.println("ˮ����һ��info����...");
	}
}

class Apple2 extends Fruit{
	//ʹ��@Overrideָ������ķ���������д���෽��
	@Override
	public void info() {
		System.out.println("ƻ����дˮ����һ��info����...");
	}
}
