package Imitation_Code;

public class TypeConversion{
	public static  void main(String[] args){
		byte b = 127;
		char c = 'W';
		short s = 23561;
		int i = 3333;
		long l = 400000L;
		float f = 3.14159f;
		double d = 54.523;
		//һ�������ֵ
		System.out.println("byte b = 127  "+
		"char c = 'W'  "+
		"short s = 23561  "+
		"int i = 3333  "+
		"long l = 400000L  "+
		"float f = 3.14159f  "+
		"double d = 54.523  ");
		//�����ֵ
		System.out.println("byte b = 127");
		System.out.println("char c = 'W'");
		System.out.println("short s = 23561");
		System.out.println("int i = 3333");
		System.out.println("long l = 400000L");
		System.out.println("float f = 3.14159f");
		System.out.println("double d = 54.523");
		System.out.println("~~~~~~~~~~~~~~~~");
		//��������������Զ�ת��
		System.out.println("�ۼ�byte���ڣ�"+b);
		System.out.println("�ۼ�char���ڣ�"+(b+c));
		System.out.println("�ۼ�short���ڣ�"+(b+c+s));
		System.out.println("�ۼ�int���ڣ�"+(b+c+s+i));
		System.out.println("�ۼ�long���ڣ�"+(b+c+s+i+l));
		System.out.println("�ۼ�float���ڣ�"+(b+c+s+i+l+f));
		System.out.println("�ۼ�double���ڣ�"+(b+c+s+i+l+f+d));
		//�����͵������͵�ǿ��ת��
		System.out.println("��longǿ��ת��Ϊint��"+(int)l);
		//�����͵�������ת���ᶪʧ����
		System.out.println("��intǿ��ת��Ϊshort��"+(short)i);
		//ʵ��������ת��������С������
		System.out.println("��doubleǿ��ת��Ϊint��"+(int)d);
		//�������ַ����͵�ת������ȡ��Ӧ������ַ�
		System.out.println("��shortǿ��ת��Ϊchar��"+(char)s);		
	}
}