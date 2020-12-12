package com.example;

public class ExecTest
{
    public static void main(String[] args)
        throws Exception
    {
        Runtime rt = Runtime.getRuntime();
        // 运行记事本程序
        rt.exec("notepad.exe");
    }
}