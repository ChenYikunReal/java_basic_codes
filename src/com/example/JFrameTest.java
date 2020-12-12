package com.example;

import  javax.swing.*; 
public class JFrameTest{
    public static void main(String[] args){
        JFrame f = new JFrame("测试窗口");
        // 设置窗口大小，位置
        f.setBounds(30, 30, 250, 200);
        // 将窗口显示出来
        f.setVisible(true);
    }
}