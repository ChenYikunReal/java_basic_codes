package Imitation_Code;

import java.util.Scanner;
import java.io.File;

public class ScannerFileTest{
	public static void main(String[] args)
		throws Exception
	{
		//将一个File对象作为Scanner的构造器参数，Scanner读取文件内容
		Scanner scan = new Scanner(new File("ScannerFileTest.java"));
		System.out.println("ScannerFileTest.java文件的内容如下：");
		//判断是否有下一行
		while(scan.hasNextLine()){
			//输出文件的下一行
			System.out.println(scan.nextLine());
		}
	}
}