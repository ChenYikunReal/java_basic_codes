package Imitation_Code;

public class GcTest1{
	public static void main(String[] args){
		for (int i = 0; i < 4; i ++){
			new GcTest1();
		}
	}
	public void finalize(){
		System.out.println("ϵͳ��������GcTest�������Դ����");
	}
}