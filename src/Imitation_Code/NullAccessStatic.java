package Imitation_Code;

public class NullAccessStatic{
	private static void test(){
		System.out.println("static���ε��෽��");
	}
	public static void main(String[] args){
		//����һ��NullAccessStatic��������ֵΪnull
		NullAccessStatic nas = null;
		//ʹ��null�������������ľ�̬����
		nas.test();
	}
}