package Imitation_Code;

import java.util.Scanner;

public class IfTest{
	public static void main(String[] args){
		String str1 = "W";
		String str2 = "M";
		System.out.println("请输入你的年龄(周岁)：");
		Scanner scan1 = new Scanner(System.in);
		int age = scan1.nextInt();
		System.out.println("请输入你的性别（M/W）：");
		Scanner scan2 = new Scanner(System.in);
		String sex = scan2.nextLine();
		if (sex.equals(str1)){
			System.out.println("您好，尊敬的女士♀~~~");
			if (age < 0 || age > 120){
				System.out.println("你怕不是在逗我!");
			}else{
				System.out.println("你的年龄是：" + age);
				if (age < 18){
					System.out.println("小朋友，你还没长大呦！");
				}else if (age >= 18){
					System.out.println("你的年龄已经达到18岁了");
					System.out.println("你应该学会承担起自己的责任了！");
					if (age <40){
						System.out.println("美女，你单身吗？");
					}else if (age >= 40 && age <60){
						System.out.println("中年大妈，你好呀~~~");
					}else{
						System.out.println("老奶奶，需要我扶你过马路吗？^__^");
					}
				}
			}
		}else if (sex.equals(str2)){
			System.out.println("您好，尊敬的男士♂~~~");
			if (age < 0 || age > 120){
				System.out.println("你怕不是在逗我!");
			}else{
				System.out.println("你的年龄是：" + age);
				if (age < 18){
					System.out.println("小朋友，你还没长大呦！");
				}else if (age >= 18){
					System.out.println("你的年龄已经达到18岁了");
					System.out.println("你应该学会承担起自己的责任了！");
					if (age <40){
						System.out.println("小哥♂哥，do you like van♂游戏？");
					}else if (age >= 40 && age <60){
						System.out.println("中年大叔，你好呀~~~");
					}else{
						System.out.println("老爷爷，需要我扶你上楼吗？^__^");
					}
				}
			}
		}else{
			System.out.println("我只想知道你是中性主义还是你不想说，Bye!");
		}
		System.out.println("你可以滚了!");
		System.out.println("md，累死老子了！");
	}
}