package Imitation_Code;

import java.util.Scanner;

public class IfTest{
	public static void main(String[] args){
		String str1 = "W";
		String str2 = "M";
		System.out.println("�������������(����)��");
		Scanner scan1 = new Scanner(System.in);
		int age = scan1.nextInt();
		System.out.println("����������Ա�M/W����");
		Scanner scan2 = new Scanner(System.in);
		String sex = scan2.nextLine();
		if (sex.equals(str1)){
			System.out.println("���ã��𾴵�Ůʿ��~~~");
			if (age < 0 || age > 120){
				System.out.println("���²����ڶ���!");
			}else{
				System.out.println("��������ǣ�" + age);
				if (age < 18){
					System.out.println("С���ѣ��㻹û�����ϣ�");
				}else if (age >= 18){
					System.out.println("��������Ѿ��ﵽ18����");
					System.out.println("��Ӧ��ѧ��е����Լ��������ˣ�");
					if (age <40){
						System.out.println("��Ů���㵥����");
					}else if (age >= 40 && age <60){
						System.out.println("������裬���ѽ~~~");
					}else{
						System.out.println("�����̣���Ҫ�ҷ������·��^__^");
					}
				}
			}
		}else if (sex.equals(str2)){
			System.out.println("���ã��𾴵���ʿ��~~~");
			if (age < 0 || age > 120){
				System.out.println("���²����ڶ���!");
			}else{
				System.out.println("��������ǣ�" + age);
				if (age < 18){
					System.out.println("С���ѣ��㻹û�����ϣ�");
				}else if (age >= 18){
					System.out.println("��������Ѿ��ﵽ18����");
					System.out.println("��Ӧ��ѧ��е����Լ��������ˣ�");
					if (age <40){
						System.out.println("С���磬do you like van����Ϸ��");
					}else if (age >= 40 && age <60){
						System.out.println("������壬���ѽ~~~");
					}else{
						System.out.println("��үү����Ҫ�ҷ�����¥��^__^");
					}
				}
			}
		}else{
			System.out.println("��ֻ��֪�������������廹���㲻��˵��Bye!");
		}
		System.out.println("����Թ���!");
		System.out.println("md�����������ˣ�");
	}
}