package Imitation_Code;
import java.awt.*;
import java.awt.BorderLayout;
public class BorderLayoutTest1 {
	public static void main(String[] args) {
		Frame f = new Frame("���Դ���");
		//����Frame����ʹ��BorderLayout���ֹ�����
		f.setLayout(new BorderLayout(30, 5));
		f.add(new Button("��"), BorderLayout.SOUTH);
		f.add(new Button("��"), BorderLayout.NORTH);
		//Ĭ����ӵ��м�����
		f.add(new Button("��"));
		f.add(new Button("��"), BorderLayout.EAST);
		f.add(new Button("��"), BorderLayout.WEST);
		//���ô���Ϊ��Ѵ�С
		f.pack();
		//��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}

}
