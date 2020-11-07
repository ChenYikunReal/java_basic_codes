package Imitation_Code;

public class StringBuilderTest{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		//追加字符串
		sb.append("java");	//sb = "java"
		System.out.println(sb);
		//插入
		sb.insert(0, "hello ");	//sb = "hello java"
		System.out.println(sb);
		//替换
		sb.replace(5,6,",");	//sb = "hellp,java"
		System.out.println(sb);
		//删除
		sb.delete(5,6);	//sb = "hellojava"
		System.out.println(sb);
		//反转
		sb.reverse();	//sb = "avajolleh"
		System.out.println(sb);
		System.out.println(sb.length());	//输出9
		System.out.println(sb.capacity());	//输出16
		//改变StringBuilder的长度，将只保留前面部分
		sb.setLength(5);	//sb = "avajo"
		System.out.println(sb);
	}
}