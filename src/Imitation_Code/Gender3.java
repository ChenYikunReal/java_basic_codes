package Imitation_Code;

public enum Gender3{
	//�˴���ö��ֵ������ö�Ӧ�Ĺ�����������
	MALE("��"), FEMALE("Ů");
	/*
	��������д����൱�ڣ�
	public static final Gender MALE = new Gender("��");
	public static final Gender FEMALE = new Gender("Ů");
	*/
	private final String name;
	//ö����Ĺ�����ֻ��ʹ��private����
	private Gender3(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}