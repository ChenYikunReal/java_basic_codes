package Imitation_Code;

import java.util.Scanner;

public class ScannerKeyBoardTest{
	public static void main(String[] args){
		//System.in�����׼���룬���Ǽ�������
		Scanner scan = new Scanner(System.in);
		//��������һ�н�ֻ�ѻس���Ϊ�ָ���
		scan.useDelimiter("\n");
		//�ж��Ƿ�����һ�������
		while (scan.hasNext()){
			//���������
			System.out.println("��������������ǣ�" + scan.next());
		}
	}
}