package com.example;

import java.util.*;

public class EnumerationTest {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("高等数学");
        v.add("离散数学");
        Hashtable<String, Integer> scores = new Hashtable<>();
        scores.put("语文", 124);
        scores.put("数学", 107);
        Enumeration<String> em = v.elements();
        while (em.hasMoreElements()) {
            System.out.println(em.nextElement());
        }
        Enumeration<String> keyEm = scores.keys();
        while (keyEm.hasMoreElements()) {
            Object key = keyEm.nextElement();
            System.out.println(key + "----->" +scores.get(key));
        }
    }

}