package Imitation_Code;
import java.awt.*;
import java.awt.event.*;
public class WindowAdapterTest {
	private Frame f = new Frame("���Դ���");
	private TextArea ta = new TextArea(6, 40);
	public void init() {
		f.addWindowListener(new MyListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	class MyListener extends WindowAdapter{
		public void windowClosing(WindowEvent e) {
			System.out.println("�û����ڹرմ��ڣ�\n");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new WindowAdapterTest().init();
	}

}
