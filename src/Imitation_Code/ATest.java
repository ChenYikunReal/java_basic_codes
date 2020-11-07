package Imitation_Code;

interface A{
	void test();
}
public class ATest{
	public static void main(String[] args){
		int age = 8;
		//下面代码将导致编译错误
		//由于age局部变量被匿名内部类访问了，因此age相当于被final修饰了
		//age = 2;
		A a = new A(){
			public void test(){
				//在Java8以前下面语句将提示错误：age必须使用final修饰
				//从Java8开始，匿名内部类、局部内部类允许访问非final的局部变量
				System.out.println(age);
			}
		};
		a.test();
	}
}