package Imitation_Code;

public class StaticAccessNonStatic{
	public void info(){
		System.out.println("�򵥵�info����");
	}
	public static void main(String[] args){
		//��Ϊmain()�����Ǿ�̬��������info()�ǷǾ�̬����
		//����main()�������Ǹ��౾�������Ǹ����ʵ��
		//���ʡ�Ե�this�޷�ָ����Ч����
		//info();
		new StaticAccessNonStatic().info();
		//���ȷʵ��Ҫ��һ����̬�����з���һ����ͨ��������ֻ���ؽ�һ������
	}
}