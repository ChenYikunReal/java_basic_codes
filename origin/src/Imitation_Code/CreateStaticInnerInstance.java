package Imitation_Code;

class StaticOut{
	//����һ����̬�ڲ��࣬�����÷��ʿ��Ʒ�
	//��ͬһ���������������Է��ʸ��ڲ���
	static class StaticIn{
		public StaticIn(){
			System.out.println("��̬�ڲ���Ĺ�����");
		}
	}
}
public class CreateStaticInnerInstance{
	public static void main(String[] args){
		StaticOut.StaticIn in = new StaticOut.StaticIn();
		/*
		���������Ըĳ��������д���
		ʹ��OuterClass.InnerClass����ʽ�����ڲ������
		StaticOut.StaticIn in;
		ͨ��new�������ڲ��๹����������̬�ڲ���ʵ��
		in = new StaticOut.StaticIn();
		*/
	}
}