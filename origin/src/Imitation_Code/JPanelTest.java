package Imitation_Code;

import javax.swing.*;
import java.awt.*;

public class JPanelTest{
	public static void main(String[] args){
		JFrame f = new JFrame("���Դ���");
		//����һ��Panel����
		JPanel p = new JPanel(); 
		//��Panel����������������
		p.add(new JTextField(20));
		p.add(new JButton("�����"));
		//��Panel������ӵ�Frame������
		f.add(p);
		//���ô��ڴ�С��λ��
		f.setBounds(30, 30, 250, 120);
		//��������ʾ����
		f.setVisible(true);
	}
}