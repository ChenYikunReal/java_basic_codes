package Imitation_Code;

public class UnsignedTest{
	public static void main(String[] args){
		byte b = -3;
		//��byte���͵�-3ת��Ϊ�޷�������
		System.out.println("byte���͵�-3��Ӧ���޷�������" + Byte.toUnsignedInt(b));	//���253
		//�ƶ���ʮ�����ƽ����޷�������
		int val = Integer.parseUnsignedInt("ab", 16);
		System.out.println(val);	//���171
		//��12ת��Ϊ�޷���int�ͣ�Ȼ��ת����ʮ�����Ƶ��ַ���
		System.out.println(Integer.toUnsignedString(-12, 16));	//���fffffff4
		//��������ת��Ϊ�޷��������Ժ����
		System.out.println(Integer.divideUnsigned(-2, 3));
		//����������ת��Ϊ�޷������������ȡ��
		System.out.println(Integer.remainderUnsigned(-2, 7));
	}
}