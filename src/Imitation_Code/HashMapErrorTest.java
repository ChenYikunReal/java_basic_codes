package Imitation_Code;

import java.util.*;

public class HashMapErrorTest {
	public static void main(String[] args){
		HashMap ht = new HashMap();
		// 此处的A类与前一个程序的A类是同一个类
		ht.put(new AAA(60000) , "疯狂Java讲义");
		ht.put(new AAA(87563) , "轻量级Java EE企业应用实战");
		// 获得Hashtable的key Set集合对应的Iterator迭代器
		Iterator it = ht.keySet().iterator();
		// 取出Map中第一个key，并修改它的count值
		A first = (A)it.next();
		//导致key不能被准确访问
		//first.count = 87563;   // ①
		// 输出{A@1560b=疯狂Java讲义, A@1560b=轻量级Java EE企业应用实战}
		System.out.println(ht);
		// 只能删除没有被修改过的key所对应的key-value对
		ht.remove(new AAA(87563));
		System.out.println(ht);
		// 无法获取剩下的value，下面两行代码都将输出null。
		System.out.println(ht.get(new AAA(87563)));   // ② 输出null
		System.out.println(ht.get(new AAA(60000)));   // ③ 输出null
	}
}
