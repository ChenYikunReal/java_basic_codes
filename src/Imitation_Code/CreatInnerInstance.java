package Imitation_Code;

class Out1{
	//����һ���ڲ��࣬��ʹ�÷��ʿ��Ʒ�
	//��ֻ��ͬһ�����е���������Է��ʸ��ڲ���
	class In1{
		public In1(String msg){
			System.out.println(msg);
		}
	}
}
public class CreatInnerInstance{
	public static void main(String[] args){
		Out1.In1 in = new Out1().new In1("������Ϣ");
		/*
		���������Ըĳ��������д���
		ʹ�õ���ʽ�����ڲ������
		Out1.In in;
		�����ⲿ��ʵ�����Ǿ�̬�ڲ���ʵ���������ڸ�ʵ����
		Out1 out = new Out1();
		ͨ���ⲿ��ʵ�����������ڲ��๹���������Ǿ�̬�ڲ���ʵ��
		in = out.new In1("������Ϣ");
		*/
	}
}