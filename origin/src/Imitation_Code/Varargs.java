package Imitation_Code;

public class Varargs{
	//�������βθ����ɱ�ķ���
	public static void test(int a , String...books){
	//Ҳ��������д��public static void test(int a , String[] books){
		//books���������鴦��
		for (String tmp : books){
			System.out.println(tmp);
		}
		//�����������a��ֵ
		System.out.println(a);
	}
	public static void main(String[] args){
		//����test����
		test(5, "������ѧ����", "��ѧ����", "��ɢ��ѧ", "���Java����");
		//���������Ļ��������������÷�����
		//test(5, new String[]{"������ѧ����", "��ѧ����", "��ɢ��ѧ", "���Java����"});
	}
}