package Imitation_Code;

class BaseClassB{
	public int book = 6;
	public void base(){
		System.out.println("�������ͨ����");
	}
	public void test(){
		System.out.println("����ı����ǵķ���");
	}
}

public class SubClassB extends BaseClassB{
	//���¶���һ��bookʵ���������ظ����bookʵ������
	public String book = "�ߵ���ѧ";
	public void test(){
		System.out.println("����ĸ��Ǹ���ķ���");
	}
	public void sub(){
		System.out.println("�������ͨ����");
	}
	public static void main(String[] args){
		//�������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		BaseClassB bc = new BaseClassB();
		//���6
		System.out.println(bc.book);
		//�������ε��ý�ִ��BaseClass����
		bc.base();
		bc.test();
		//�������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
		SubClassB sc = new SubClassB();
		//���"�ߵ���ѧ"
		System.out.println("sc.book");
		//������ý�ִ�дӸ���̳�����base()����
		sc.base();
		//���潫ִ�е�ǰ���test()����
		sc.test();
		//�������ʱ���ͺ�����ʱ���Ͳ�һ������̬����
		BaseClassB ploymophicBc = new SubClassB();
		//���6-----�������ʵ��Ǹ�������ʵ������
		System.out.println(ploymophicBc.book);
		//���潫���ôӸ���̳�����base()����
		ploymophicBc.base();
		//���潫ִ�е�ǰ���test()����
		ploymophicBc.test();
		//��ΪploymophicBc����ʱ������BaseClass,BaseClass�ಢδ�ṩsub()��������������������ʱ����ִ���
		//ploymophicBc.sub();
	}
}