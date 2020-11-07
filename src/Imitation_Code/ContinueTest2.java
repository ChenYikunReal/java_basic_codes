package Imitation_Code;

public class ContinueTest2{
	public static void main(String[] args){
		//外层循环，outer作为标识符
		outer:
		for (int i = 0; i < 8; i ++){
			if (i ==4){
				//忽略本次循环剩下的语句
				continue outer;
				
			}
			System.out.println("continue后输出的语句");
			//内层循环
			for (int j = 0; j < 3; j++){
				System.out.println("i的值为：" + i + "，j的值为：" + j);
				if (j ==1){
					//忽略outer标签所指定的的循环中本次循环所剩下的语句
					continue outer;
				}
			}
		}
	}
}