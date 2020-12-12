package com.example;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class MatchesTest {
    public static void main(String[] args) {
        String[] mails = 
        {
                "kongyeelu@163.com",
                "kongyeeku@gmail.com",
                "ligang@crazyit.org",
                "wawa@abc.xx"
        };
        String mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
        Pattern mailPattern = Pattern.compile(mailRegEx);
        Matcher matcher = null;
        for (String mail : mails) {
            if(matcher == null) {
                matcher = mailPattern.matcher(mail);
            }else{
                matcher.reset(mail);
            }
            String result = mail +(matcher.matches() ? "是" : "不是") + "一个有效的地址";
            System.out.println(result);
        }
    }

}