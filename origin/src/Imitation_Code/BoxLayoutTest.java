package Imitation_Code;
import java.awt.*;
import javax.swing.BoxLayout;
public class BoxLayoutTest {
	private Frame f = new Frame("����");
	public void init() {
		f.setLayout(new BoxLayout(f, BoxLayout.Y_AXIS));
		//���水ť������ֱ����
		f.add(new Button("��һ����ť"));
		f.add(new Button("��ť��"));
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new BoxLayoutTest().init();
	}

}