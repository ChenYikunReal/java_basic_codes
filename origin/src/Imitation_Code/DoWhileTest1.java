package Imitation_Code;

public class DoWhileTest1{
	public static void main(String[] args){
		int count = 1;
		do{
			System.out.println(count);
			count ++;
			//循环条件紧跟while关键字
		}while (count < 10);
		System.out.println("循环结束！");
	}
}