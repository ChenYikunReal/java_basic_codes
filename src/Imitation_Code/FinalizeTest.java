package Imitation_Code;

public class FinalizeTest{
	private static FinalizeTest ft = null;
	public void info(){
		System.out.println("����������Դ��finalize����");
	}
	public static void main(String[] args){
		//����FinalizeTest������������ɻָ�״̬
		new FinalizeTest();
		//֪ͨϵͳ������Դ����
		System.gc();
		//ǿ���������ջ��Ƶ��ÿɻָ������finalize()����
		//Runtime.getRuntime().runFinalization();
		System.runFinalization();
		ft.info();
	}
	public void finalize(){
		//��ft������ͼ���յĿɻָ����󣬼��ɻָ��������±�ɿɴ�
		ft = this;
	}
}