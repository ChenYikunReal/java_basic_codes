package com.example;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest{
    public static void main(String[] args) throws Exception{
        // 创建一个字符串对象
        String str = new String("高等数学");
        // 创建一个引用队列
        ReferenceQueue rq = new ReferenceQueue();
        // 创建一个虚引用，让此虚引用引用到"高等数学"字符串
        PhantomReference pr = new PhantomReference(str, rq);
        // 查看引用的对象的内容
        System.out.println(pr.get());
        // 切断str引用和字符串之间的联系
        str = null;
        // 取出虚引用所引用的对象，并且不能通过虚引用获取被引用的对象，故此处输出null
        System.out.println(pr.get());
        // 强制垃圾回收
        System.gc();
        System.runFinalization();
        // 垃圾回收之后，虚引用将被放在引用队列中
        // 取出引用队列中最先进入队列的引用与pr进行比较
        System.out.println(pr.get());
    }
}