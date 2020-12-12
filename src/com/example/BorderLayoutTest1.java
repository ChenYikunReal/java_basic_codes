package com.example;
import java.awt.*;
import java.awt.BorderLayout;
public class BorderLayoutTest1 {
    public static void main(String[] args) {
        Frame f = new Frame("测试窗口");
        // 设置Frame容器使用BorderLayout布局管理器
        f.setLayout(new BorderLayout(30, 5));
        f.add(new Button("南"), BorderLayout.SOUTH);
        f.add(new Button("北"), BorderLayout.NORTH);
        // 默认添加到中间区域
        f.add(new Button("中"));
        f.add(new Button("东"), BorderLayout.EAST);
        f.add(new Button("西"), BorderLayout.WEST);
        // 设置窗口为最佳大小
        f.pack();
        // 将窗口显示出来（Frame对象默认处于隐藏状态）
        f.setVisible(true);
    }

}