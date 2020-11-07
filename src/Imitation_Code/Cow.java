package Imitation_Code;

import java.util.Scanner;

public class Cow{
	private double weight;

	//外部类的两个重载的构造器
	public Cow () { }

	public Cow (double weight){
		this.weight = weight;
	}

	//定义一个非静态内部类
	private class CowLeg{
		//非静态内部类的两个实例变量
		private double length;
		private String color;

		//非静态内部类的两个重载的构造器
		public CowLeg () { }
		public CowLeg(double length, String color){
			this.length = length;
			this.color = color;
		}

		public void setLength(double length){
			this.length = length;
		}

		public Double getLength(){
			return this.length;
		}

		public void setColor(String color){
			this.color = color;
		}

		public String getColor(){
			return this.color;
		}

		public void info(){
			System.out.println("当前牛腿颜色是：" + color + "，高为：" + length);
			//直接访问外部类private修饰的变量
			System.out.println("本牛腿所在的奶牛重：" + weight);
		}
	}

	public void test(double length, String color){
		CowLeg cl = new CowLeg(length, color);
		cl.info();
	}

	public static void main(String[] args){
		Scanner scan1 = new Scanner(System.in);
		System.out.println("请输入Cow的weight(单位:kg)：");
		double weight = scan1.nextDouble();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("请输入CowLeg的length(单位:cm)：");
		double length = scan2.nextDouble();
		Scanner scan3 = new Scanner(System.in);
		System.out.println("请输入CowLeg的color：");
		String color = scan3.nextLine();
		Cow cow = new Cow(weight);
		cow.test(length, color);
		scan1.close();
	    scan2.close();
	    scan3.close();
	}
}