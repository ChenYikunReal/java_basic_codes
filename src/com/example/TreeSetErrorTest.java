package com.example;

import java.util.*;

class Err{}

public class TreeSetErrorTest {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        // 向TreeSet集合里添加两个Err对象
        ts.add(new Err());
    }

}