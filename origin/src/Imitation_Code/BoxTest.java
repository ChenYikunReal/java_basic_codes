package Imitation_Code;
import java.awt.*;
import javax.swing.Box;
public class BoxTest {
	private Frame f = new Frame("����");
	//����ˮƽ�ڷ������Box����
	private Box horizontal = Box.createHorizontalBox();
	//����ˮƽ�ڷ������Box����
	private Box vertical = Box.createVerticalBox();
	public void init() {
		horizontal.add(new Button("ˮƽ��ťһ"));
		horizontal.add(new Button("ˮƽ��ť��"));
		vertical.add(new Button("��ֱ��ťһ"));
		vertical.add(new Button("��ֱ��ť��"));
		f.add(horizontal, BorderLayout.NORTH);
		f.add(vertical);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new BoxTest().init();
	}

}
