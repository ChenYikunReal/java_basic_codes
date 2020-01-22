package Imitation_Code;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest{
	public static void main(String[] args){
		JFrame f = new JFrame("测试窗口");
		//创建一个ScrollPane容器，指定总是有滚动条
		JScrollPane sp = new JScrollPane();
 		//分别设置水平和垂直滚动条总是出现
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//向ScrollPane容器中添加两个组件
		sp.add(new JTextField(20));
		sp.add(new JButton("点击我"));
		//将ScrollPane容器添加到Frame对象中
		f.add(sp);
		//设置窗口大小、位置
		f.setBounds(30, 30, 750, 500);
		//将窗口显示出来
		f.setVisible(true);
	}
}
//JScrollPane.JSCROLLBARS_ALWAYS