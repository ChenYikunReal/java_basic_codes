package Imitation_Code;
import java.awt.*;
public class BorderLayoutTest2 {
	public static void main(String[] args) {
		Frame f = new Frame("���Դ���");
		//����Frame����ʹ��BorderLayout���ֹ�����
		f.setLayout(new BorderLayout(30, 5));
		f.add(new Button("About  Baidu"), BorderLayout.SOUTH);
		f.add(new Button("����   13~0"), BorderLayout.NORTH);
		//����һ��Panel����
		Panel p = new Panel();
		//��Panel������������
		p.add(new TextField(20));
		p.add(new Button("�ٶ�һ��"));
		//Ĭ����ӵ��м��������м����������һ��Panel����
		f.add(p);
		//f.add(new Button("��"), BorderLayout.EAST);
		//f.add(new Button("��"), BorderLayout.WEST);
		//���ô���Ϊ��Ѵ�С
		f.pack();
		//��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}

}
