package Imitation_Code;

import java.util.*;
public class ObjectsTest{
	//����һ��obj����������Ĭ��ֵ��null
	static ObjectsTest obj;
	public static void main(String[] args){
		//���һ��null�����hashCodeֵ�����null
		System.out.println(Objects.hashCode(obj));
		//���һ��null�����toStringֵ�����0
		System.out.println(Objects.toString(obj));
		//Ҫ��obj����Ϊnull�������������ָ���쳣  NullPointerException
		System.out.println(Objects.requireNonNull(obj, "obj�Ĳ���������null��"));
	}
}