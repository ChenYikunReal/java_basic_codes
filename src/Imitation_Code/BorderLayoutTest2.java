package Imitation_Code;
import java.awt.*;
public class BorderLayoutTest2 {
	public static void main(String[] args) {
		Frame f = new Frame("测试窗口");
		//设置Frame容器使用BorderLayout布局管理器
		f.setLayout(new BorderLayout(30, 5));
		f.add(new Button("About  Baidu"), BorderLayout.SOUTH);
		f.add(new Button("沈阳   13~0"), BorderLayout.NORTH);
		//创建一个Panel对象
		Panel p = new Panel();
		//向Panel中添加两个组件
		p.add(new TextField(20));
		p.add(new Button("百度一下"));
		//默认添加到中间区域，向中间区域中添加一个Panel容器
		f.add(p);
		//f.add(new Button("东"), BorderLayout.EAST);
		//f.add(new Button("西"), BorderLayout.WEST);
		//设置窗口为最佳大小
		f.pack();
		//将窗口显示出来（Frame对象默认处于隐藏状态）
		f.setVisible(true);
	}

}
