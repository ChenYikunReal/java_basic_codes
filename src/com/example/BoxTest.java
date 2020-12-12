package com.example;
import java.awt.*;
import javax.swing.Box;
public class BoxTest {
    private Frame f = new Frame("测试");
    // 定义水平摆放组件的Box对象
    private Box horizontal = Box.createHorizontalBox();
    // 定义水平摆放组件的Box对象
    private Box vertical = Box.createVerticalBox();
    public void init() {
        horizontal.add(new Button("水平按钮一"));
        horizontal.add(new Button("水平按钮二"));
        vertical.add(new Button("垂直按钮一"));
        vertical.add(new Button("垂直按钮二"));
        f.add(horizontal, BorderLayout.NORTH);
        f.add(vertical);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new BoxTest().init();
    }

}