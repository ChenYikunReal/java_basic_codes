package Imitation_Code;

public class Outer{
	private int outProp = 9;
	class Inner{
		private int inProp = 5;
		public void accessOuterProp(){
			//�Ǿ�̬�ڲ���ĳ�Ա����ֱ�ӷ����ⲿ���private��Ա����
			System.out.println("�ⲿ���outPropֵ��" + outProp);
		}
	}
	public void accessInnerProp(){
		//�ⲿ�಻��ֱ�ӷ��ʷǾ�̬�ڲ����ʵ������
		//������뽫���ֱ������
		//System.out.println("�ڲ����inPropֵ��" + inProp);
		//�����Ҫ�����ڲ����ʵ��������������ʽ�����ڲ������
		System.out.println("�ڲ�������inPropֵ��" + new Inner().inProp);
	}
	public static void main(String[] args){
		//ִ��������룬ֻ�������ⲿ����󣬻�δ�����ڲ������
		Outer out = new Outer();
		out.accessInnerProp();
	}
}