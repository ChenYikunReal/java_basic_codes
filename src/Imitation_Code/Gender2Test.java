package Imitation_Code;

public class Gender2Test{
	public static void main(String[] args){
		Gender2 g = Gender2.valueOf("FEMALE");
		g.setName("Ů");
		System.out.println(g + "����" + g.getName());
		//��ʱ����nameֵ����ʾ��������
		//g.setName("��");
		//System.out.println(g + "����" + g.getName());
	}
}