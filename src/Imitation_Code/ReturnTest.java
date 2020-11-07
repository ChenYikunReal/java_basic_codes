package Imitation_Code;

public class ReturnTest{
	public static void main(String[] args){
		//一个简单的for循环
		for (int i = 0; i < 10; i++){
			System.out.println("i的值为：" + i);
			if (i == 4){
				return;
			}
			System.out.println("return后的输出语句");
		}
	}
}