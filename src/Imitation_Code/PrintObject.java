package Imitation_Code;

class Person3{
	private String name;
	public Person3(String name){
		this.name = name;
	}
}

public class PrintObject{
	public static void main(String[] args){
		//创建一个Person对象，将之赋给p变量
		Person3 p = new Person3("孙悟空");
		//打印p所引用的Person对象
		System.out.println(p);
		//本机本次输出结果为Person@512ddf17输出结果可能不同
		//下面的输出有相同的效果，也是这种现象的本质
		System.out.println(p.toString());
	}
}