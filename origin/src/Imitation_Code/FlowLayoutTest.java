package Imitation_Code;
import java.awt.*;
public class FlowLayoutTest {
	public static void main(String[] args) {
		Frame f = new Frame("���Դ���");
		//����Frame����ʹ��FlowLayout���ֹ�����
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
		//�򴰿������10����ť
		for (int i = 0; i < 10; i++) {
			int j = i+1;
			f.add(new Button("��ť" + j));
		}
		//���ô���Ϊ��Ѵ�С
		f.pack();
		//��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}

}
