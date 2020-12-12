package com.example;

import java.util.*;

import static java.util.Calendar.*;

public class CalendarTest{
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        // 取出年
        System.out.println(c.get(YEAR));
        // 取出月
        System.out.println(c.get(MONTH));
        // 取出日
        System.out.println(c.get(DATE));
        // 分别设置年、月、日、时、分、秒
        c.set(2019, 6, 8, 0, 0, 0);        // 2019-6-8 00:00:00
        System.out.println(c.getTime());
        // 将Calender的年前推一年
        c.add(YEAR, -1);
        System.out.println(c.getTime());
        // 将Calender的年前推8个月
        c.add(MONTH, -8);
        System.out.println(c.getTime());
    }
}