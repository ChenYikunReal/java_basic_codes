package com.example;

import java.util.Scanner;

public class ScannerLongTest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLong()){
            System.out.println("键盘输入的内容是：" + scan.nextLong());
        }
    }
}