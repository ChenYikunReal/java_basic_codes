package Imitation_Code;

public class ArgsTest{
	public static void main(String[] args){
		//输出args数组的长度
		System.out.println(args.length);
		//遍历args数组里的每一个元素
		for (String arg : args){
			System.out.println(arg);
		}
	}
}