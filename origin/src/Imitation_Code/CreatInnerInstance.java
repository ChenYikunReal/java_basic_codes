package Imitation_Code;

class Out1{
	//定义一个内部类，不使用访问控制符
	//即只有同一个包中的其他类可以访问该内部类
	class In1{
		public In1(String msg){
			System.out.println(msg);
		}
	}
}
public class CreatInnerInstance{
	public static void main(String[] args){
		Out1.In1 in = new Out1().new In1("测试信息");
		/*
		上面代码可以改成如下三行代码
		使用的形式定义内部类变量
		Out1.In in;
		创建外部类实例，非静态内部类实例将寄生在该实例中
		Out1 out = new Out1();
		通过外部类实例和来调用内部类构造器创建非静态内部类实例
		in = out.new In1("测试信息");
		*/
	}
}