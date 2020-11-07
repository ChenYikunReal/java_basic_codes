package Imitation_Code;

public class BlockTest{
	public static void main(String[] args){
		{
			int a;
			//System.out.println("a: " + a);是错误的，未赋值，必须显式格式化
			a = 5;
			System.out.println("a: " + a);
		}
	//System.out.println("a: " + a);     a是局部变量，代码块外面找不到，所以这句也错
	}
}