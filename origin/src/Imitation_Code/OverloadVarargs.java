package Imitation_Code;

public class OverloadVarargs{
	public void test(String msg){
		System.out.println("ֻ��һ���ַ���������test������");
	}
	//��Ϊǰ���Ѿ�����һ��test������test����������һ���ַ�����������ʽ
	//�˴��ĸ����ɱ��β��ﲻ����һ���ַ�����������ʽ
	public void test(String...books){
		System.out.println("~~~****�βθ����ɱ��test����****~~~");
	}
	public static void main(String[] args){
		OverloadVarargs olv = new OverloadVarargs();
		//���潫����ִ�еڶ���test����
		olv.test();
		olv.test("aa", "bb");
		olv.test("f", "*", "*", "k");
		//���潫����ִ�е�һ������
		olv.test("aa");
		//�ڶ���
		olv.test(new String[] {"aa"});
	}
}