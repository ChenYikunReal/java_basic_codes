package Imitation_Code;

public class StringSwitchTest{
	public static void main(String[] args){
		//声明变量season
		String season = "summer";
		//执行switch分支语句
		switch (season){
			case "spring":
				System.out.println("春暖花开……");
				break;
			case "summer":
				System.out.println("夏日炎炎……");
				break;
			case "autumn":
				System.out.println("秋高气爽……");
				break;
			case "winter":
				System.out.println("白雪皑皑……");
				break;
			default:
				System.out.println("季节输入错误");
		}
	}
}