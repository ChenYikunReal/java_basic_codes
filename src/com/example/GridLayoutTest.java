package com.example;
import java.awt.*;
public class GridLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("Chen的计算器");
        Panel p1 = new Panel();
        p1.add(new TextField(30));
        f.add(p1, BorderLayout.NORTH);
        Panel p2 = new Panel();
        // 设置Panel使用GridLayout布局管理器
        p2.setLayout(new GridLayout(3, 5, 4, 4));
        String[] name = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "×", "÷", "."};
        // 向Panel容器中添加15个按钮
        for (int i = 0; i< name.length; i++) {
            p2.add(new Button(name[i]));
        }
        // 默认将Panel对象添加到Frame窗口的中间
        f.add(p2);
        // 设置窗口为最佳大小
        f.pack();
        // 将窗口显示出来
        f.setVisible(true);
    }

}