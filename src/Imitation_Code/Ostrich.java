package Imitation_Code;

class Bird1{
	//Bird���fly()����
	public void fly(){
		System.out.println("����������ɵķ��衭��");
	}
}
public class Ostrich extends Bird1{
	//��дBird���е�fly()����
	public void fly(){
		System.out.println("��ֻ���ڵ��ϱ��ܡ���");
	}
	public void callOverridedMethed(){
		//���ø��౻���ǵ�ʵ������
		super.fly();
	}
	public static void main(String[] args){
		//����Ostrich����
		Ostrich os = new Ostrich();
		//����callOverridedMethed����
		System.out.println("�����ң�Birdһ�㶼�ܣ�");
		os.callOverridedMethed();
		//����fly����
		System.out.println("Ȼ���ң�������~~~");
		os.fly();
	}
}