package com.example;

import java.util.*;

class RR implements Comparable{
    int count;
    public RR(int count) {
        this.count = count;
    }
    public String toString() {
        return "R[count:" +count + "]";
    }
    // 重写equals()方法，根据count值来判断是否相等
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == RR.class) {
            RR r = (RR)obj;
            return r.count == this.count;
        }
        return false;
    }
    // 重写compareTo()方法，根据count值来比较大小
    public int compareTo(Object obj) {
        RR r = (RR)obj;
        return count > r.count ? 1 :
            count < r.count ? -1 : 0;
    }
}


public class TreeSetTest3 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new RR(5));
        ts.add(new RR(-3));
        ts.add(new RR(9));
        ts.add(new RR(-2));
        // 打印TreeSet集合，集合元素是有序排列的
        System.out.println(ts);
        // 取出第一个元素
        RR first = (RR)ts.first();
        // 对第一个元素的count赋值
        first.count = 20;
        // 取出最后一个元素
        RR last = (RR)ts.last();
        // 对最后一个元素的count赋值，与第二个元素的count相同
        last.count = -2;
        // 再次输出将看到TreeSet里的元素处于无序状态，且有重复元素
        System.out.println(ts);
        // 删除实例变量被改变的元素，删除失败
        System.out.println(ts.remove(new RR(-2)));
        System.out.println(ts);
        // 删除实例变量没有改变的元素，删除成功
        System.out.println(ts.remove(new RR(5)));
        System.out.println(ts);
    }

}