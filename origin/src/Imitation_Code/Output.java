package Imitation_Code;

public interface Output{
	//接口里定义的成员变量只能是常量
	int MAX_CACHE_LINE = 50;
	//接口里定义的普通方法只能是public的抽象方法
	void out();
	void getData(String msg);
	//在接口中定义默认方法，需要用default修饰
	default void print(String...msgs){
		for(String msg : msgs){
			System.out.println(msg);
		}
	}
	//在接口中定义默认方法，需要使用default修饰
	default void test(){
		System.out.println("默认的test()方法");
	}
	static String staticTest(){
		return "接口里的类方法";
	}
	//定义私有化方法
	private void foo(){
		System.out.println("foo的私有方法");
	}
	//定义私有静态方法
	private static void bar(){
		System.out.println("bar的私有静态方法");
	}
}