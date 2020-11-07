package Imitation_Code;

import java.awt.*;

public class DialogTest {
	Frame f = new Frame("测试窗口");
	Dialog d1 = new Dialog(f, "模式对话框", true);
	Dialog d2 = new Dialog(f, "非模式对话框", false);
	Button b1 = new Button("打开模式对话框");
	Button b2 = new Button("打开非模式对话框");
	public void init() {
		d1.setBounds(20, 30, 300, 400);
		d2.setBounds(20, 30, 300, 400);
		b1.addActionListener(e -> d1.setVisible(true));
		b2.addActionListener(e -> d2.setVisible(true));
		f.add(b1);
		f.add(b2, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new DialogTest().init();
	}
}
