package Imitation_Code;
@FunctionalInterface
public interface FunInterface {
	static void foo() {
		System.out.println("foo�෽��");
	}
	default void bar() {
		System.out.println("barĬ�Ϸ���");
	}
	void test();	//ֻ����һ�����󷽷�
	//void abc();	//���ܼ���������
}