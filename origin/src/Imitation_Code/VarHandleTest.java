package Imitation_Code;

import java.lang.invoke.*;
import java.util.Arrays;

class User1{
	String name;
	static int MAX_AGE;
}

public class VarHandleTest {
	public static void main(String[] args) throws Throwable{
		String[] sa = new String[] {"Java", "Kotlin", "Go"};
		//��ȡһ��String[]�����VarHandle����
		VarHandle avh = MethodHandles.arrayElementVarHandle(String[].class);
		//�Ƚϲ����ã����������Ԫ����Go�����Ԫ�ر�����ΪLua
		boolean r = avh.compareAndSet(sa, 2, "Go", "Lua");
		//����ȽϽ��
		System.out.println(r);	//���true
		//����������Ԫ�ر��滻��Lua
		System.out.println(Arrays.toString(sa));
		//��ȡsa����ĵڶ���Ԫ��
		System.out.println(avh.get(sa,1));	//���Kotlin
		//��ȡ�����ã����ص�����Ԫ�أ�����������Ԫ������ΪSwift
		System.out.println(avh.getAndSet(sa, 2, "Swift"));
		//����������Ԫ�ر��滻��Swift
		System.out.println(Arrays.toString(sa));
		//��findVarHandle������ȡUser������Ϊname������ΪString��ʵ������
		VarHandle vh1 = MethodHandles.lookup().findVarHandle(User1.class, "name", String.class);
		User1 user = new User1();
		//ͨ��VarHandle��ȡʵ��������ֵ����Ҫ���������Ϊ������
		System.out.println(vh1.get(user));	//���null
		//ͨ��VarHandle����ָ��ʵ��������ֵ
		vh1.set(user, "�����");
		//���user��nameʵ��������ֵ
		System.out.println(user.name);	//��������
		//��findVarHandle������ȡUser������ΪMAX_AGE������ΪInteger�������
		VarHandle vh2 = MethodHandles.lookup().findStaticVarHandle(User1.class, "MAX_AGE", int.class);
		//ͨ��VarHandle��ȡָ���������ֵ
		System.out.println(vh2.get());	//���0
		//ͨ��VarHandle����ָ���������ֵ
		vh2.set(100);
		//���User��MAX_AGE�����
		System.out.println(User1.MAX_AGE);	//���100
	}

}
