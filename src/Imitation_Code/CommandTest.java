package Imitation_Code;

public class CommandTest{
	public static void main(String[] args){
		ProcessArray pa = new ProcessArray();
		int[] target = {3, -4, 6, 4};
		//��һ�δ������飬����Ĵ�����Ϊȡ����PrintCommand
		pa.process(target, new PrintCommand());
		System.out.println("============");
		//�ڶ��δ������飬������Ϊȡ����AddCommand
		pa.process(target, new AddCommand());
	}
}