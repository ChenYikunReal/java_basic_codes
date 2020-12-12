package com.example;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws IOException{
        try (
            // 创建字符输入流
            FileReader fr = new FileReader("FileReaderTest.java")) {
            // 创建一个长度为32的“竹筒”
            char[] cbuf = new char[32];
            // 用于保存实际读取的字符数
            int hasRead = 0;
            // 使用循环来重复“取水”过程
            while ((hasRead = fr.read(cbuf)) > 0) {
                // 取出“竹筒”里的水滴（字符），将字符数组转换成字符串输出
                System.out.println(new String(cbuf, 0, hasRead));
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}