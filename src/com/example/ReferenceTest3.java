package com.example;

import java.lang.ref.WeakReference;

public class ReferenceTest3{
    public static void main(String[] args) throws Exception{
        // 创建一个字符串对象
        String str = new String("高等数学");
        // 创建一个弱引用，让此弱引用引用到"高等数学"字符串
        WeakReference wr = new WeakReference(str);
        // 查看引用的对象的内容
        System.out.println(wr.get());
        // 切断str引用和字符串之间的联系
        str = null;
        // 取出弱引用所引用的对象
        System.out.println(wr.get());
        // 强制垃圾回收
        System.gc();
        System.runFinalization();
        // 再次取出弱引用所引用的对象
        System.out.println(wr.get());
    }
}