package Imitation_Code;

public class GcTest2{
	public static void main(String[] args){
		for (int i = 0; i < 4; i ++){
			new GcTest2();
			//�������д����������ȫ��ͬ��ǿ��ϵͳ������������
			//System.gc();
			Runtime.getRuntime().gc();
		}
	}
	public void finalize(){
		System.out.println("ϵͳ��������GcTest�������Դ����");
	}
}