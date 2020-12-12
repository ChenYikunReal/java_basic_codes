package com.example;
import java.util.Locale;
public class LocaleList {
    public static void main(String[] args) {
        // 返回Java所支持的全部国家和语言的数组
        Locale[] localeList = Locale.getAvailableLocales();
        // 遍历数组的每个元素，以此获取所支持的国家和语言
        for (int i = 0; i < localeList.length; i++) {
            // 输出所支持的国家和语言
            System.out.println(localeList[i].getDisplayCountry() + "=" + localeList[i].getCountry() + " " + localeList[i].getDisplayLanguage() + "=" +localeList[i].getLanguage());
        }
    }

}
// 这个程序可以获取Java所支持的国家/语言环境