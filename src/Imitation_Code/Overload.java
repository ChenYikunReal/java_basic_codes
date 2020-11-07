package Imitation_Code;

public class Overload{
	//下面定义了两个test()方法，但是方法的形参列表不同
	//系统可以区分这两种方法，这叫做方法重载
	public void test(){
		System.out.println("无参数！");
	}
	public void test(String msg){
		System.out.println("重载的test方法！" + msg);
	}
	public static void main(String[] args){
		Overload ol = new Overload();
		//调用test方法没传入参数，所以调用第一个
		ol.test();
		//传入了一个字符串参数，所以调用第二个
		ol.test("Overload!");
	}
}