package com.example;
import java.awt.*;
import java.awt.event.*;
public class EventQs {
    Frame f = new Frame("测试窗口");
    private Button ok = new Button("确定");
    private TextField tf = new TextField(30);
    public void init() {
        // 注册事件监听器
        ok.addActionListener(new OkListener());
        f.add(tf);
        f.add(ok, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }
    // 定义事件监听器类
    class OkListener implements ActionListener{
        // 下面定义的方法就是事件处理器，用于相应特定事件
        public void actionPerformed(ActionEvent e) {
            System.out.println("用户单机了ok按钮");
            tf.setText("Hello World");
        }
    }
    public static void main(String[] args) {
        new EventQs().init();
    }

}