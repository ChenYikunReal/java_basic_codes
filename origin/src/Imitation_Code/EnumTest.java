package Imitation_Code;

public class EnumTest{
	public void judge(SeasonEnum s){
		//switch���ı��ʽ������ö��ֵ
		switch (s){
			case SPRING:
				System.out.println("��ů����������̤��");
				break;
			case SUMMER:
				System.out.println("�������ף��ʺ���Ӿ");
				break;
			case AUTUMN:
				System.out.println("�����ˬ��������ʱ");
				break;
			case WINTER:
				System.out.println("����ѩƮ��Χ¯��ѩ");
				break;
		}
	}
	public static void main(String[] args){
		//ö����Ĭ����һ��valuese()���������ظ�ö���������ʵ��
		for (SeasonEnum s : SeasonEnum.values()){
			System.out.println(s);
		}
		//ʹ��ö��ʵ��ʱ����ͨ��EnumClass.variable()����ʽ����
		new EnumTest().judge(SeasonEnum.SPRING);
		new EnumTest().judge(SeasonEnum.SUMMER);
		new EnumTest().judge(SeasonEnum.AUTUMN);
		new EnumTest().judge(SeasonEnum.WINTER);
	}
}