package Imitation_Code;

public class Varargs{
	//定义了形参个数可变的方法
	public static void test(int a , String...books){
	//也可以这样写：public static void test(int a , String[] books){
		//books被当成数组处理
		for (String tmp : books){
			System.out.println(tmp);
		}
		//输出整数变量a的值
		System.out.println(a);
	}
	public static void main(String[] args){
		//调用test方法
		test(5, "工科数学分析", "大学物理", "离散数学", "疯狂Java讲义");
		//如果用数组的话，可以这样调用方法：
		//test(5, new String[]{"工科数学分析", "大学物理", "离散数学", "疯狂Java讲义"});
	}
}