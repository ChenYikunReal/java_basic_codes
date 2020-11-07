package Imitation_Code;

import java.util.*;

public class WeakHashMapTest {
	public static void main(String[] args) {
		WeakHashMap whm = new WeakHashMap();
		//向WeakHashMap中添加三个key-value对
		//三个key-value对都是匿名字符串对象（没有其他引用）
		whm.put(new String("语文"), new String("及格"));
		whm.put(new String("数学"), new String("优秀"));
		whm.put(new String("地理"), new String("良好"));
		//向WeakHashMap中添加一个key-value对
		//该key是一个系统缓存的字符串对象
		whm.put("化学", new String("中等"));
		//输出whm字符串对象，将看到四个key-value对
		System.out.println(whm);
		//通知系统立即进行垃圾回收
		System.gc();
		System.runFinalization();
		//在正常情况下，将只看到一个key-value对
		System.out.println(whm);
	}

}
