package Imitation_Code;
import java.awt.*;
public class ScrollPaneTest {
	public static void main(String[] args) {
		Frame f = new Frame("���Դ���");
		//����һ��ScrollPane������ָ�������й�����
		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		//��ScrollPane����������������
		sp.add(new TextField(20));
		sp.add(new Button("������"));
		//��ScrollPane������ӵ�Frame������
		f.add(sp);
		//���ô��ڵĴ�С��λ��
		f.setBounds(30, 30, 250, 120);
		//��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}

}
