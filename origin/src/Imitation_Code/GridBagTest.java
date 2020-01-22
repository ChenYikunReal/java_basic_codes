package Imitation_Code;

import java.awt.*;

public class GridBagTest {
	private Frame f = new Frame("���Դ���");
	private GridBagLayout gb = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();
	private Button[] bs = new Button[10];
	public void init() {
		f.setLayout(gb);
		for (int i = 0; i < bs.length; i++) {
			bs[i] = new Button("��ť" + i);
		}
		//��������������ں�����������
		gbc.fill = GridBagConstraints.REMAINDER;
		gbc.weightx = 1;
		addButton(bs[0]);
		addButton(bs[1]);
		addButton(bs[2]);
		//��GridBagConstraints���Ƶ�GUI��������Ϊ��������һ�����
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		addButton(bs[3]);
		//��GridBagConstraints���Ƶ�GUI������ں����ϲ�������
		gbc.weightx = 0;
		addButton(bs[4]);
		//��GridBagConstraints���Ƶ�GUI����������������
		gbc.gridwidth = 2;
		addButton(bs[5]);
		//��GridBagConstraints���Ƶ�GUI��������һ������
		gbc.gridwidth = 1;
		//��GridBagConstraints���Ƶ�GUI������������Ͽ���������
		gbc.gridheight = 2;
		//��GridBagConstraints���Ƶ�GUI�������Ϊ�������һ�����
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		addButton(bs[6]);
		//��GridBagConstraints���Ƶ�GUI������������Խһ�����������Խ��������
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		//��GridBagConstraints���Ƶ�GUI��������������Ȩ����1
		gbc.weighty = 1;
		addButton(bs[7]);
		//�������õİ�ť�������ϲ�������
		gbc.weighty = 0;
		//��GridBagConstraints���Ƶ�GUI��������Ϊ�������һ�����
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		//��GridBagConstraints���Ƶ�GUI������������Ͽ�һ������
		gbc.gridheight = 1;
		addButton(bs[8]);
		addButton(bs[9]);
		f.pack();
		f.setVisible(true);
	}
	public void addButton(Button button) {
		gb.setConstraints(button, gbc);
		f.add(button);
	}
	public static void main(String[] args) {
		new GridBagTest().init();
	}
}
