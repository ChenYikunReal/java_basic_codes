package Imitation_Code;

import java.util.Scanner;

public class ScannerKeyBoardTest{
	public static void main(String[] args){
		//System.in代表标准输入，就是键盘输入
		Scanner scan = new Scanner(System.in);
		//增加下面一行将只把回车作为分隔符
		scan.useDelimiter("\n");
		//判断是否还有下一个输出项
		while (scan.hasNext()){
			//输出输入项
			System.out.println("键盘输入的内容是：" + scan.next());
		}
	}
}