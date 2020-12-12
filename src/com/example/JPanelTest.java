package com.example;

import javax.swing.*;
import java.awt.*;

public class JPanelTest{
    public static void main(String[] args){
        JFrame f = new JFrame("测试窗口");
        // 创建一个Panel容器
        JPanel p = new JPanel(); 
        // 向Panel容器中添加两个组件
        p.add(new JTextField(20));
        p.add(new JButton("点击我"));
        // 将Panel容器添加到Frame窗口中
        f.add(p);
        // 设置窗口大小、位置
        f.setBounds(30, 30, 250, 120);
        // 将窗口显示出来
        f.setVisible(true);
    }
}