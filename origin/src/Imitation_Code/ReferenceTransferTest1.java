package Imitation_Code;

class DataWrap1{
	int a;
	int b;
}

public class ReferenceTransferTest1{
	public static void swap(DataWrap1 dw){
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap�����a��ֵ�ǣ�" + dw.a + "��b��ֵ�ǣ�" + dw.b);
		//��dwֱ�Ӹ�ֵΪnull����������ָ���κ���Ч��ַ������
		dw = null;
		//��Ȼ�������δ�ı�
		//System.out.println("swap�����a��ֵ�ǣ�" + dw.a + "��b��ֵ�ǣ�" + dw.b);
	}
	public static void main(String[] args){
		DataWrap1 dw = new DataWrap1();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("���������Ժ�a��ֵ�ǣ�" + dw.a + "��b��ֵ�ǣ�" + dw.b);
	}
}