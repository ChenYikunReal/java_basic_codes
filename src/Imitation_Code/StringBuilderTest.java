package Imitation_Code;

public class StringBuilderTest{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		//׷���ַ���
		sb.append("java");	//sb = "java"
		System.out.println(sb);
		//����
		sb.insert(0, "hello ");	//sb = "hello java"
		System.out.println(sb);
		//�滻
		sb.replace(5,6,",");	//sb = "hellp,java"
		System.out.println(sb);
		//ɾ��
		sb.delete(5,6);	//sb = "hellojava"
		System.out.println(sb);
		//��ת
		sb.reverse();	//sb = "avajolleh"
		System.out.println(sb);
		System.out.println(sb.length());	//���9
		System.out.println(sb.capacity());	//���16
		//�ı�StringBuilder�ĳ��ȣ���ֻ����ǰ�沿��
		sb.setLength(5);	//sb = "avajo"
		System.out.println(sb);
	}
}