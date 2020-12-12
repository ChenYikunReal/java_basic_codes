package com.example;

import java.util.logging.*;

public class LoggerTest {
    public static void main(String[] args) throws Exception {
        // 获取System,Logger对象
        System.Logger logger = System.getLogger("fkjava");
        // 设置日志级别
        Logger.getLogger("fkjava").setLevel(Level.FINE);
        // 设置使用a.xml保存日志记录
        Logger.getLogger("fkjava").addHandler(new FileHandler("a.xml"));
        logger.log(System.Logger.Level.DEBUG, "debug信息");
        logger.log(System.Logger.Level.INFO, "info信息");
        logger.log(System.Logger.Level.ERROR, "error信息");
    }

}