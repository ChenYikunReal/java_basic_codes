package Imitation_Code;

import java.util.*;

class AAA {
	int count;
	public AAA(int count) {
		this.count = count;
	}
	//根据count的值来判断两个对象是否相等
	public boolean equals(Object obj) {
		if (obj == this) 
			return true;
		if (obj != null && obj.getClass() == AAA.class) {
			AAA a = (AAA)obj;
			return this.count == a.count;
		}
		return false;
	}
	//根据count的值来计算hashCode的值
	public int hashCode() {
		return this.count;
	}
}

class BBB{
	//重写equals()方法，B对象与任何对象通过equals()方法比较都返回true
	public boolean equals(Object obj) {
		return true;
	}
}

public class HashtableTest {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new AAA(60000), "高等数学");
		ht.put(new AAA(87563), "线性代数");
		ht.put(new AAA(1232), "离散数学");
		System.out.println(ht);
		//只要两个对象通过equals()方法比较返回true，Hashtable就认为它们是相等的value
		//由于Hashtable只有一个B对象，它与任何对象通过equals()方法比较都相等，所以下面输出true
		System.out.println(ht.containsValue("测试字符串"));	//输出true
		//只要两个对象的count相等，它们通过equals()方法比较返回true，且hashCode值相等
		//Hashtable即认为它们是相等的key，所以下面输出true
		System.out.println(ht.containsKey(new AAA(87563)));	//输出true
		//下面语句可以删除最后一个key-value对
		ht.remove(new AAA(1232));
		System.out.println(ht);
	}

}
