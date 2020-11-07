package Imitation_Code;

import java.lang.ref.WeakReference;

public class ReferenceTest3{
	public static void main(String[] args) throws Exception{
		//����һ���ַ�������
		String str = new String("�ߵ���ѧ");
		//����һ�������ã��ô����������õ�"�ߵ���ѧ"�ַ���
		WeakReference wr = new WeakReference(str);
		//�鿴���õĶ��������
		System.out.println(wr.get());
		//�ж�str���ú��ַ���֮�����ϵ
		str = null;
		//ȡ�������������õĶ���
		System.out.println(wr.get());
		//ǿ����������
		System.gc();
		System.runFinalization();
		//�ٴ�ȡ�������������õĶ���
		System.out.println(wr.get());
	}
}