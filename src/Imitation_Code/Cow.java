package Imitation_Code;

import java.util.Scanner;

public class Cow{
	private double weight;

	//�ⲿ����������صĹ�����
	public Cow () { }

	public Cow (double weight){
		this.weight = weight;
	}

	//����һ���Ǿ�̬�ڲ���
	private class CowLeg{
		//�Ǿ�̬�ڲ��������ʵ������
		private double length;
		private String color;

		//�Ǿ�̬�ڲ�����������صĹ�����
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
			System.out.println("��ǰţ����ɫ�ǣ�" + color + "����Ϊ��" + length);
			//ֱ�ӷ����ⲿ��private���εı���
			System.out.println("��ţ�����ڵ���ţ�أ�" + weight);
		}
	}

	public void test(double length, String color){
		CowLeg cl = new CowLeg(length, color);
		cl.info();
	}

	public static void main(String[] args){
		Scanner scan1 = new Scanner(System.in);
		System.out.println("������Cow��weight(��λ:kg)��");
		double weight = scan1.nextDouble();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("������CowLeg��length(��λ:cm)��");
		double length = scan2.nextDouble();
		Scanner scan3 = new Scanner(System.in);
		System.out.println("������CowLeg��color��");
		String color = scan3.nextLine();
		Cow cow = new Cow(weight);
		cow.test(length, color);
		scan1.close();
	    scan2.close();
	    scan3.close();
	}
}