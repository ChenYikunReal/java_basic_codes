package Imitation_Code;

import java.lang.invoke.*;

public class MethodHandleTest {
	//����һ��private�෽��
	private static void hello() {
		System.out.println("Hello World!");
	}
	//����һ��privateʵ������
	private String hello(String name) {
		System.out.println("ִ�д�������hello" + name);
		return name + "���";
	}
	
	public static void main(String[] args) throws Throwable{
		//����һ������ֵΪvoid�������βεķ�������
		MethodType type = MethodType.methodType(void.class);
		//ʹ��MethodHandles.Lookup��findStatic��ȡ�෽��
		MethodHandle mtd = MethodHandles.lookup().findStatic(MethodHandleTest.class, "hello", type);
		//ͨ��MethodHandleִ�з���
		mtd.invoke();
		//ʹ��MethodHandles.Lookup��findVirtual��ʵ������
		//ָ����ȡ����ֵΪString���β�ΪString�ķ�������
		MethodHandle mtd2 = MethodHandles.lookup().findVirtual(MethodHandleTest.class, "hello", MethodType.methodType(String.class, String.class));
		//ͨ��MethodHandleִ�з�����������������Ͳ���
		System.out.println(mtd2.invoke(new MethodHandleTest(), "�����"));
	}

}
