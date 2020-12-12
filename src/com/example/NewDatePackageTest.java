package com.example;

import java.time.*;
import java.util.*;

public class NewDatePackageTest{
    public static void main(String[] args){
        // -----下面是关于Clock的用法-----
        System.out.println("-----下面是关于Clock的用法-----");
        // 获取当前Clock
        Clock clock = Clock.systemUTC();
        // 通过Clock获取当前时刻
        System.out.println("当前时刻为：" + clock.instant());
        // 获取clock对应的毫秒数，与System.currentTimeMillis()输出相同
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());

        // -----下面是关于Duration的用法-----
        System.out.println("-----下面是关于Duration的用法-----");
        Duration d = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于" + d.toMinutes() +"分");
        System.out.println("6000秒相当于" + d.toHours() +"小时");
        System.out.println("6000秒相当于" + d.toDays() +"天");
        // 在clock的基础上再加上6000秒，返回新的Clock
        Clock clock2 = Clock.offset(clock, d);
        // 可以看到clock2与clock1相差1小时40分钟
        System.out.println("当前时刻加6000秒为：" + clock2.instant());

        // -----下面是关于Instant的用法-----
        System.out.println("-----下面是关于Instant的用法-----");
        // 获取当前时间
        Instant instant = Instant.now();
        System.out.println(instant);
        // instant添加6000秒（即100分钟），返回新的Instant
        Instant instant2 = instant.plusSeconds(6000);
        System.out.println(instant2);
        // 根据字符串解析Instant对象
        Instant instant3 = Instant.parse("2019-03-20T17:15:00.342z");
        System.out.println(instant3);
        // 在instant3的基础上添加5小时4分钟
        Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println(instant4);
        // 获取instant4五天以前的时刻
        Instant instant5 = instant4.minus(Duration.ofDays(5));
        System.out.println(instant5);

        // -----下面是关于LocalDate的用法-----
        System.out.println("-----下面是关于LocalDate的用法-----");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // 获取2019年的第111天
        localDate = LocalDate.ofYearDay(2019, 111);
        System.out.println(localDate);
        // 设置为2019年5月1日
        localDate = LocalDate.of(2019, Month.MAY, 1);
        System.out.println(localDate);
        // 设置为2019年11月11日
        localDate = LocalDate.of(2019, Month.SEPTEMBER, 11);
        System.out.println(localDate);

        // -----下面是关于LocalTime的用法-----
        System.out.println("-----下面是关于LocalTime的用法-----");
        // 获取当前时间
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        // 设置为22点30分
        localTime = LocalTime.of(22, 30);
        System.out.println(localTime);
        // 返回一天中的第5555秒
        localTime = LocalTime.ofSecondOfDay(5555);
        System.out.println(localTime);

        // -----下面是关于LocalDateTime的用法-----
        System.out.println("-----下面是关于LocalTime的用法-----");
        // 获取当前日期、时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        // 当前日期、时间的基础上添加25小时3分钟
        LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
        System.out.println("当前日期、时间的25小时3分钟以后：" + future);

        // -----下面是关于Year、YearMonth、MonthDay的用法示例-----
        System.out.println("-----下面是关于Year、YearMonth、MonthDay的用法示例-----");
        Year year = Year.now();            // 获取当前年份
        System.out.println("当前年份：" + year);        // 输出当前年份
        year = year.plusYears(5);            // 当前年份再加五年
        System.out.println("当前年份再过五年：" + year);    // 输出五年以后的年份
        // 根据指定月份获取YearMonth
        YearMonth ym = year.atMonth(10);
        System.out.println("year年10月：" + ym);
        // 当前年月再加5年再减3个月
        ym = ym.plusYears(5).minusMonths(3);
        System.out.println("year年10月再加5年再减3个月：" + ym);
        MonthDay md = MonthDay.now();
        System.out.println("当前月日：" + md);
        // 设置为6月8日
        MonthDay md2 = md.with(Month.JUNE).withDayOfMonth(8);
        System.out.println("6月8日为：" + md2);
    }
}