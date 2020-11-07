package Imitation_Code;

public class LocalInnerTest{
	public static void main(String[] args){
		//定义局部内部类
		class InnerBase{
			int a;
		}
		//定义局部内部类的子类
		class InnerSub extends InnerBase{
			int b;
		}
		//创建局部内部类的对象
		InnerSub is = new InnerSub();
		is.a = 5;
		is.b = 8;
		System.out.println("InnerSub的对象a和b的实例变量是：" + is.a + ", " + is.b);
	}
}