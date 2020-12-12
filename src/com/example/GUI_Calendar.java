package com.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Calendar extends JFrame implements ActionListener{
    int   i=0;
    JButton BUTTON;
    JTextField YEAR_text,MONTH_text;
    JLabel lableYear,lableMonth,lableCalendarTitle;
    JTextField lableCalendar_1,lableCalendar_2,lableCalendar_3,lableCalendar_4,lableCalendar_5,lableCalendar_6;
    public GUI_Calendar(){
        super("简易万年历  ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lableYear = new JLabel("请输入年份");
        lableMonth = new JLabel("请输入月份");
        lableCalendarTitle = new JLabel("星期日          星期一           星期二          星期三          星期四          星期五          星期六");
        YEAR_text=new JTextField("1110",5);
        MONTH_text=new JTextField("726",5);
        lableCalendar_1=new JTextField("",42);
        lableCalendar_2=new JTextField("",42);
        lableCalendar_3=new JTextField("",42);
        lableCalendar_4=new JTextField("",42);
        lableCalendar_5=new JTextField("",42);
        lableCalendar_6=new JTextField("",42);
        lableCalendar_1.setEditable(false);
        lableCalendar_2.setEditable(false);
        lableCalendar_3.setEditable(false);
        lableCalendar_4.setEditable(false);
        lableCalendar_5.setEditable(false);
        lableCalendar_6.setEditable(false);
        BUTTON=new JButton("查询");
        BUTTON.addActionListener(this);
        Container CalendarFrame=getContentPane();
        CalendarFrame.setLayout(new FlowLayout());
        CalendarFrame.add(lableYear);
        CalendarFrame.add(YEAR_text);
        CalendarFrame.add(lableMonth);
        CalendarFrame.add(MONTH_text);
        CalendarFrame.add(BUTTON);
        CalendarFrame.add(lableCalendarTitle);
        CalendarFrame.add(lableCalendar_1);
        CalendarFrame.add(lableCalendar_2);
        CalendarFrame.add(lableCalendar_3);
        CalendarFrame.add(lableCalendar_4);
        CalendarFrame.add(lableCalendar_5);
        CalendarFrame.add(lableCalendar_6);
        setSize(500,300);
    }
    public boolean cheak_leapYear(int theYear){
        if((theYear%4==0)||(theYear%100==0)&&(theYear%400!=0))// 检测是否为闰年
            return true;// 如果是闰年，返回真
        else
            return false;// 如果不是闰年，返回假
    }
    public int calculate_dayNum(int theYear,int theMonth){
        GUI_Calendar Calendar=new GUI_Calendar();
        boolean leapYear;
        leapYear=Calendar.cheak_leapYear(theYear);// 判断是否为闰年
        // 如果是2月份
        if(theMonth==2){
            if(leapYear==true)
                return 29;
            else
                return 28;
        }
        if(theMonth==4||theMonth==6||theMonth==9||theMonth==11)
            return 30;
        return 31;
    }
    public int calculate_weekNum(int theYear,int theMonth){   
        int theWeek=0;
        int isChange=0;
        // 如果是1或者2月，则通过基姆拉尔森计算公式转换
        if (theMonth==1||theMonth==2){ 
            theMonth+=12; 
            theYear--; 
            isChange=1;
        } 
        theWeek=(1+2*theMonth+3*(theMonth+1)/5+theYear+theYear/4-theYear/100+theYear/400)%7;// 基姆拉尔森计算公式
        // 如果已近转换，则还原显示
        if(isChange==1) {
               theMonth-=12; 
            theYear++; 
        }

        switch(theWeek){
            case 0: return 1;
            case 1: return 2;
            case 2: return 3;
            case 3: return 4;
            case 4: return 5;
            case 5: return 6;
            case 6: return 0;
        }
        return 1110;
    }
    public void actionPerformed(ActionEvent e){
        int inputYear=Integer.parseInt(YEAR_text.getText().trim());
        int inputMonth=Integer.parseInt(MONTH_text.getText().trim());
        int monthDayNum=0;// 本月总共的天数
        int hangNum=0;
        int dayNum=1;// 当前使用的日期
        int weekNum=0;// 本月第一天的星期值
        int dayNum_old=0;// 当前使用的日期
        int dayNum_chose=0;// 当前使用的日期
        
        GUI_Calendar Calendar=new GUI_Calendar();
        
        monthDayNum=Calendar.calculate_dayNum(inputYear,inputMonth);
        weekNum=Calendar.calculate_weekNum(inputYear,inputMonth);
        
        switch(weekNum){
            case 0: 
                weekNum=8;
                lableCalendar_1.setText("    1"+"                   2" +"                      3"+"                     4" +"                      5" +"                     6" +"                    7");
                dayNum=7;
                break;
            case 1: 
                lableCalendar_1.setText("      "+"                   1" +"                      2"+"                     3" +"                      4" +"                     5" +"                    6");
                dayNum=6;
                break;
            case 2: 
                lableCalendar_1.setText("        "+"                    " +"                      1"+"                     2" +"                      3" +"                     4" +"                    5");
                dayNum=5;
                break;
            case 3: 
                lableCalendar_1.setText("         "+"                    " +"                       "+"                     1" +"                      2" +"                     3" +"                    4");
                dayNum=4;
                break;
            case 4: 
                lableCalendar_1.setText("          "+"                    " +"                       "+"                      " +"                      1" +"                     2" +"                    3");
                dayNum=3;
                break;
            case 5: 
                lableCalendar_1.setText("            "+"                    " +"                       "+"                      " +"                       " +"                     1" +"                    2");
                dayNum=2;
                break;
            case 6: 
                lableCalendar_1.setText("             "+"                    " +"                       "+"                      " +"                       " +"                      " +"                    1");
                dayNum=1;
                break;
        }
        weekNum=dayNum+1;
        if (e.getSource() == BUTTON){ 
            // 打印本月份的日期
            for(dayNum=weekNum;dayNum<=monthDayNum;dayNum+=7){
                switch(hangNum){
                    case 0: 
                        lableCalendar_2.setText("    "+(dayNum)+"                   " +(dayNum+1)+"                      " +(dayNum+2)+"                     " +(dayNum+3)+"                      " +(dayNum+4)+"                     " +(dayNum+5)+"                    " +(dayNum+6));
                        break;
                    case 1: 
                        lableCalendar_3.setText("   "+(dayNum)+"                 " +(dayNum+1)+"                   " +(dayNum+2)+"                   " +(dayNum+3)+"                    " +(dayNum+4)+"                   " +(dayNum+5)+"                  " +(dayNum+6));
                        break;
                    case 2: 
                        lableCalendar_4.setText("   "+(dayNum)+"                 " +(dayNum+1)+"                   " +(dayNum+2)+"                   " +(dayNum+3)+"                    " +(dayNum+4)+"                   " +(dayNum+5)+"                  " +(dayNum+6));
                        dayNum_old=(dayNum+6);
                        break;
                    case 3: 
                        dayNum_chose=monthDayNum-dayNum_old;
                        switch(dayNum_chose){
                            case 0: 
                                weekNum=8;
                                lableCalendar_5.setText("   ");
                                lableCalendar_6.setText("   ");
                                break;
                            case 1: 
                                lableCalendar_5.setText("   "+(dayNum_old+1));
                                lableCalendar_6.setText("   ");
                                break;
                            case 2: 
                                lableCalendar_5.setText("   "+(dayNum_old+1)+"                 " +(dayNum_old+2));
                                lableCalendar_6.setText("   ");
                                break;
                            case 3: 
                                lableCalendar_5.setText("   "+(dayNum_old+1)+"                 " +(dayNum_old+2)+"                   " +(dayNum_old+3));
                                lableCalendar_6.setText("   ");
                                break;
                            case 4: 
                                lableCalendar_5.setText("   "+(dayNum_old+1)+"                 " +(dayNum_old+2)+"                   " +(dayNum_old+3)+"                   " +(dayNum_old+4));
                                lableCalendar_6.setText("   ");
                                break;
                            case 5: 
                                lableCalendar_5.setText("   "+(dayNum_old+1)+"                 " +(dayNum_old+2)+"                   " +(dayNum_old+3)+"                   " +(dayNum_old+4)+"                    " +(dayNum_old+5));
                                lableCalendar_6.setText("   ");
                                break;
                            case 6: 
                                lableCalendar_5.setText("   "+(dayNum_old+1)+"                 " +(dayNum_old+2)+"                   " +(dayNum_old+3)+"                   " +(dayNum_old+4)+"                    " +(dayNum_old+5)+"                   " +(dayNum_old+6));
                                lableCalendar_6.setText("   ");
                                break;
                            case 7: 
                                lableCalendar_5.setText("   "+(dayNum_old+1)+"                 " +(dayNum_old+2)+"                   " +(dayNum_old+3)+"                   " +(dayNum_old+4)+"                    " +(dayNum_old+5)+"                   " +(dayNum_old+6)+"                  " +(dayNum_old+7));
                                lableCalendar_6.setText("   ");
                                break;
                            case 8: 
                                lableCalendar_5.setText("   "+(dayNum_old+1)+"                 " +(dayNum_old+2)+"                   " +(dayNum_old+3)+"                   " +(dayNum_old+4)+"                    " +(dayNum_old+5)+"                   " +(dayNum_old+6)+"                  " +(dayNum_old+7));
                                lableCalendar_6.setText("   "+(dayNum_old+8));
                                break;
                            case 9: 
                                lableCalendar_5.setText("   "+(dayNum_old+1)+"                 " +(dayNum_old+2)+"                   " +(dayNum_old+3)+"                   " +(dayNum_old+4)+"                    " +(dayNum_old+5)+"                   " +(dayNum_old+6)+"                  " +(dayNum_old+7));
                                lableCalendar_6.setText("   "+(dayNum_old+8)+"                 " +(dayNum_old+9));
                                break;
                        }
                        break;
                }
                hangNum++;
            }
        }
    }
    public static void main(String args[]){
        GUI_Calendar frame=new GUI_Calendar();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}