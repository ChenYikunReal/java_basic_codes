package Imitation_Code;

public class CommandTest3{
	public static void main(String[] args){
		ProcessArray pa = new ProcessArray();
		int[] array = {3, -4, 6, 4};
		//�������飬���崦����Ϊȡ���������ڲ���
		pa.process(array, (int[] target) ->{
			int sum = 0;
			for(int tmp : target){
				sum += tmp;
			}
			System.out.println("����Ԫ�ص��ܺ��ǣ�" + sum);
		});
	}
}