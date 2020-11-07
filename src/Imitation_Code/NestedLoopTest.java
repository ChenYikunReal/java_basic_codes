package Imitation_Code;

public class NestedLoopTest{
	public static void main(String[] args){
		//外层循环
		for(int i = 0 ; i < 5 ; i++){
			//内层循环
			for(int j = 0 ; j < 3 ; j++){
				System.out.println("i的值是：" + i + ", j的值是：" + j);
			}
		}
	}
}