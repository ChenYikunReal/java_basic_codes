package Imitation_Code;

public class ForTest2{
	public static void main(String[] args){
		//ͬʱ������������ʼ��������ʹ��&&����϶��boolean���ʽ
		for(int b = 0, s = 0, p = 0; b < 10 && s < 4 && p < 10; p++){
			System.out.println(b++);
			System.out.println(++s + p);
		}
	}
}