package Imitation_Code;

import java.util.regex.*;

public class FindGroup{
	public static void main(String[] args){
		//使用字符串模拟从网上得到的网络源码
		String str = "我想求购一本《疯狂Java讲义》，尽快联系我13500006666"
				+ "交朋友，电话号码是13611125565"
				+ "出售二手电脑，联系方式15899903312";
		//System.out.println(str);
		//创建一个Pattern对象，并用它建立一个Matcher对象
		//该正则表达式只抓取13X和15X的手机号
		//实际上要抓取哪些表达式，只要修改正则表达式即可
		Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
		//Pattern p = Pattern.compile("(13\\d) | (15\\d)");
		//Matcher m = p.matcher(str);
		//boolean b = m.matches();
		//System.out.println(b);
		//将所有符合正则表达式的子串（电话号码）全部输出
		while (m.find()){
			System.out.println("符合要求的电话号码是：" +m.group());
		}
	}
}