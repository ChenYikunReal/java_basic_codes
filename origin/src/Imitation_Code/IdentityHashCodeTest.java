package Imitation_Code;

public class IdentityHashCodeTest{
	public static void main(String[] args){
		//��������е�s1��s2��������ͬ�ı���
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		//String��д��hashCode()����������Ϊ�����ַ������м���hashCodeֵ
		//��Ϊs1��s2�ַ���������ͬ���������ǵ�hashCode()��������ֵ��ͬ
		System.out.println(s1.hashCode() + "------" + s2.hashCode());
		//s1��s2�ǲ�ͬ���ַ��������������ǵ�identityhashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s1) + "------" + System.identityHashCode(s2));
		String s3 = "Java";
		String s4 = "Java";
		//s3��s4����ͬ���ַ��������������ǵ�odentityhashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s3) + "------" + System.identityHashCode(s4));
	}
}