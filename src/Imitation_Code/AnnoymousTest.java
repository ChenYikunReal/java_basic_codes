package Imitation_Code;

import java.util.*;

interface Foo<T>{
	void test(T t);
}

public class AnnoymousTest {
	public static void main(String[] args) {
		//ָ��Foo���з���ΪString
		Foo<String> f = new Foo<>() {
			//test()�����Ĳ�������ΪString
			public void test(String t) {
				System.out.println("test������t����Ϊ��" + t);
			}
		};
		//ʹ�÷���ͨ�������ʱ�൱��ͨ���������ΪObject
		Foo<?> fo = new Foo<>() {
			//test()�����Ĳ�������ΪObject
			public void test(Object t) {
				System.out.println("test������object����Ϊ��" + t);
			}
		};
		//ʹ�÷���ͨ�����ͨ���������ΪNumber
		Foo<? extends Number> fn = new Foo<>() {
			//��ʱtest()�����Ĳ�������ΪNumber
			public void test(Number t) {
				System.out.println("test������Number����Ϊ��" + t);
			}
		};
	}

}