package Imitation_Code;

public class Overload{
	//���涨��������test()���������Ƿ������β��б�ͬ
	//ϵͳ�������������ַ������������������
	public void test(){
		System.out.println("�޲�����");
	}
	public void test(String msg){
		System.out.println("���ص�test������" + msg);
	}
	public static void main(String[] args){
		Overload ol = new Overload();
		//����test����û������������Ե��õ�һ��
		ol.test();
		//������һ���ַ������������Ե��õڶ���
		ol.test("Overload!");
	}
}