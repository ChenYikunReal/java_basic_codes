package Imitation_Code;

class Apple1{
	//����info�����ѹ�ʱ
	//since����ָ�����ĸ��汾��ʼ��forRemovalָ����API��ʱ��ɾ��
	@Deprecated(since = "9", forRemoval = true)		public void info() {
		System.out.println("Apple��info����...");
	}
}
public class DeprecatedTest {
	public static void main(String[] args) {
		//����ʹ��info�����ᱻ����������
		new Apple1().info();
	}

}
