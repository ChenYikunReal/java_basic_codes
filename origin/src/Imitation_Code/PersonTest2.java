package Imitation_Code;

public class PersonTest2{
	public static void main(String[] args){
		Person4 p = new Person4();
		//��Ϊage��Ա�����Ѿ������أ�����������佫���ֱ������
		//p.age = 1000;
		//�������䲻����ֱ�����󣬵�����ʱ����ʾ������������䲻�Ϸ���
		//���򲻻��޸�p�ĳ�Ա����
		p.setAge(1000);
		//����p��age��Ա����Ҳ����Ҫͨ�����Ӧ��getter����
		//��Ϊ�����δ�ɹ�����p��age��Ա�������ʴ˴����0
		System.out.println("δ�ܳɹ�����p��age��Ա����ʱ��ageΪ��" + p.getAge());
		//�ɹ��޸�p��age��Ա����
		p.setAge(30);
		//��Ϊ����ɹ�������p��age��Ա�������ʴ˴����30
		System.out.println("�ɹ�������p��age��Ա����ʱ��ageΪ��" + p.getAge());
		//����ֱ�Ӳ���p��age��Ա������ֻ��ͨ�����Ӧ��setter����
		//��Ϊ����С�����ַ�����������2~6�����������Կ��Գɹ�����
		p.setName("��С��");
		System.out.println("�ɹ�������p��name��Ա����ʱ��ageΪ��" + p.getName());
	}
}