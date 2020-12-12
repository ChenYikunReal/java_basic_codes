package com.example;

import java.net.URL;

public class URLTest1 {
    public static void main(String[] args) throws Exception{
        String str = "http:// www.chinasei.com/article";
        URL url = new URL(str);
        System.out.println("协议为：" + url.getProtocol());
        System.out.println("主机为：" + url.getHost());
        System.out.println("文件为：" + url.getFile());
        System.out.println("路径为：" + url.getPath());
    }

}