package Imitation_Code;

import java.util.*;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("语文", 124);
		scores.put("数学", 107);
		scores.put("英语", 131);
		//调用forEach()方法遍历scores里的所有key-value对
		scores.forEach((key, value) -> System.out.println(key + "-->" + value));
		
	}

}
