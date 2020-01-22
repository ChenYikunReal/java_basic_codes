package Imitation_Code;

//����һ��Product�ӿ�
interface Product{
	int getProduceTime();
}
//��Printer��ʵ��Output��Product�ӿ�
public class Printer implements Output, Product{
	private String[] printData = new String[MAX_CACHE_LINE];
	//���Լ�¼��ǰ��Ҫ��ӡ����ҵ��
	private int dataNum = 0;
	public void out(){
		//ֻҪ������ҵ�����ͼ�����ӡ
		while (dataNum > 0){
			System.out.println("��ӡ����ӡ��" + printData[0]);
			//����ҵ��������ǰ��һλ������ʣ�µ���ҵ����1
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}
	public void getData(String msg){
		if (dataNum >= MAX_CACHE_LINE){
			System.out.println("����������������ʧ��");
		}else{
			//�Ѵ�ӡ��������ӵ�������ѱ��������������1
			printData[dataNum++] = msg;
		}
	}
	public int getProduceTime(){
		return 45;
	}
	public static void main(String[] args){
		//����һ��Printer���󣬵���Outputʹ��
		Output o = new Printer();
		o.getData("�ߵ���ѧ");
		o.getData("���Դ���");
		o.out();
		o.getData("��ɢ��ѧ");
		o.getData("��ѧ����");
		o.out();
		//����Output�ӿ��ﶨ���Ĭ�Ϸ���
		o.print("�����", "��˽�", "�׹Ǿ�");
		o.test();
		//����һ��Printer���󣬵���Productʹ��
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//���нӿ����͵����ñ���������ֱ�Ӹ���Object���͵ı���
		Object obj = p;
	}
}