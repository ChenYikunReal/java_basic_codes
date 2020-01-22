package Imitation_Code;

public class WhileTest{
	public static void main(String[] args){
		//循环的初始化条件
		int count = 0;
		//当count的值<10的时候，执行循环体
		while (count < 10){
			System.out.println(count);
			//迭代语句
			count ++;
		}
		System.out.println("循环结束！");
	}
}