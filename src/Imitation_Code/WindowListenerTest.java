package Imitation_Code;
import java.awt.*;
import java.awt.event.*;
public class WindowListenerTest {
	private Frame f = new Frame("���Դ���");
	private TextArea ta = new TextArea(6, 40);
	public void init() {
		//Ϊ������Ӵ����¼�������
		f.addWindowListener(new MyListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	//ʵ��һ�����ڼ�����
	class MyListener implements WindowListener{
		public void windowActivated(WindowEvent e) {
			ta.append("���ڱ����\n");
		}
		public void windowClosed(WindowEvent e) {
			ta.append("���ڱ��ɹ��رգ�\n");
		}
		public void windowClosing(WindowEvent e) {
			ta.append("�û��رմ��ڣ�\n");
			System.exit(0);
		}
		public void windowDeactivated(WindowEvent e) {
			ta.append("����ʧȥ���㣡\n");
		}
		public void windowDeiconified(WindowEvent e) {
			ta.append("���ڱ��ָ���\n");
		}
		public void windowIconified(WindowEvent e) {
			ta.append("���ڱ���С����\n");
		}
		public void windowOpened(WindowEvent e) {
			ta.append("���ڳ��α��򿪣�\n");
		}
	}
	public static void main(String[] args) {
		new WindowListenerTest().init();
	}

}
