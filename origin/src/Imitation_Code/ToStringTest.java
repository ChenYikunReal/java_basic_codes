package Imitation_Code;

import java.util.Scanner;

class Apple3{
	//ʹ��private���γ�Ա������������������
	private String color;
	private double weight;
	public Apple3(){	}

	//�ṩ�в����Ĺ�����
	public Apple3(String color, double weight){
		this.color = color;
		this.weight = weight;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return this.color;
	}

	public void setWeight(double weight){
		//ִ�к�����У�飬Ҫ��ƻ������������0~1kg֮��
		if (weight > 1 || weight < 0){
			System.out.println("�����õ�weight���Ϸ�");
			return;
		}else{
			this.weight = weight;
		}
	}

	public double getWeight(){
		return this.weight;
	}

	public String toString(){
		return "������һ��ƻ����color�ǣ�" + color + ", weight�ǣ�" + weight + "kg";
	}
}

public class ToStringTest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("������Apple��color��");
		String color = scan.nextLine();
		System.out.println("������Apple��weight(��λ:kg)��");
		double weight = scan.nextDouble();
		Apple3 a = new Apple3(color, weight);
		//��ӡApple����
		System.out.println(a);
	}
}
