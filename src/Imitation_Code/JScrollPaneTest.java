package Imitation_Code;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest{
	public static void main(String[] args){
		JFrame f = new JFrame("���Դ���");
		//����һ��ScrollPane������ָ�������й�����
		JScrollPane sp = new JScrollPane();
 		//�ֱ�����ˮƽ�ʹ�ֱ���������ǳ���
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//��ScrollPane����������������
		sp.add(new JTextField(20));
		sp.add(new JButton("�����"));
		//��ScrollPane������ӵ�Frame������
		f.add(sp);
		//���ô��ڴ�С��λ��
		f.setBounds(30, 30, 750, 500);
		//��������ʾ����
		f.setVisible(true);
	}
}
//JScrollPane.JSCROLLBARS_ALWAYS