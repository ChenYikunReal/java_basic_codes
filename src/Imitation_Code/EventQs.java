package Imitation_Code;
import java.awt.*;
import java.awt.event.*;
public class EventQs {
	Frame f = new Frame("���Դ���");
	private Button ok = new Button("ȷ��");
	private TextField tf = new TextField(30);
	public void init() {
		//ע���¼�������
		ok.addActionListener(new OkListener());
		f.add(tf);
		f.add(ok, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	//�����¼���������
	class OkListener implements ActionListener{
		//���涨��ķ��������¼���������������Ӧ�ض��¼�
		public void actionPerformed(ActionEvent e) {
			System.out.println("�û�������ok��ť");
			tf.setText("Hello World");
		}
	}
	public static void main(String[] args) {
		new EventQs().init();
	}

}
