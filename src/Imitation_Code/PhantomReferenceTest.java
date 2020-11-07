package Imitation_Code;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest{
	public static void main(String[] args) throws Exception{
		//����һ���ַ�������
		String str = new String("�ߵ���ѧ");
		//����һ�����ö���
		ReferenceQueue rq = new ReferenceQueue();
		//����һ�������ã��ô����������õ�"�ߵ���ѧ"�ַ���
		PhantomReference pr = new PhantomReference(str, rq);
		//�鿴���õĶ��������
		System.out.println(pr.get());
		//�ж�str���ú��ַ���֮�����ϵ
		str = null;
		//ȡ�������������õĶ��󣬲��Ҳ���ͨ�������û�ȡ�����õĶ��󣬹ʴ˴����null
		System.out.println(pr.get());
		//ǿ����������
		System.gc();
		System.runFinalization();
		//��������֮�������ý����������ö�����
		//ȡ�����ö��������Ƚ�����е�������pr���бȽ�
		System.out.println(pr.get());
	}
}