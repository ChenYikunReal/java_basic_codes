package Imitation_Code;

import java.util.*;
public class ObjectsTest{
	//定义一个obj变量，他的默认值是null
	static ObjectsTest obj;
	public static void main(String[] args){
		//输出一个null对象的hashCode值，输出null
		System.out.println(Objects.hashCode(obj));
		//输出一个null对象的toString值，输出0
		System.out.println(Objects.toString(obj));
		//要求obj不能为null，否则会引发空指针异常  NullPointerException
		System.out.println(Objects.requireNonNull(obj, "obj的参数不能是null！"));
	}
}