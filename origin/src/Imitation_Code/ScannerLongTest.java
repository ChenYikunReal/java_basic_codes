package Imitation_Code;

import java.util.Scanner;

public class ScannerLongTest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLong()){
			System.out.println("��������������ǣ�" + scan.nextLong());
		}
	}
}