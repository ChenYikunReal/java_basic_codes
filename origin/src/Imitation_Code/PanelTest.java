package Imitation_Code;
import java.awt.*;
public class PanelTest {
	public static void main(String[] args) {
		Frame f = new Frame("���Դ���");
		//����һ��Panel����
		Panel p = new Panel();
		//��Panle����������������
		p.add(new TextField(20));
		p.add(new Button("������"));
		//��Panel������ӵ�Frame������
		f.add(p);
		//���ô��ڵĴ�С��λ��
		f.setBounds(30, 30, 250, 120);
		//��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}

}
