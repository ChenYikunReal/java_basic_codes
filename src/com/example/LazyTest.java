package com.example;

import java.util.*;

import static java.util.Calendar.*;

public class LazyTest{
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        // 结果是YEAR字段+1，MONTH字段为1（2月）
        cal.set(2003, 7, 31);
        System.out.println(cal.getTime());
        // 把月份设置为9，但9月31日不存在，如果立即修改，cal将被系统自动调整到10月1日
        cal.set(MONTH, 8);
        // 将输出10月1日
        System.out.println(cal.getTime());
        // 设置DATE字段为5
        cal.set(DATE, 5);
        System.out.println(cal.getTime());
    }
}