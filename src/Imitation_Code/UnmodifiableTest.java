package Imitation_Code;

import java.util.*;

public class UnmodifiableTest {
	public static void main(String[] args) {
		//创建一个空的、不可变的List对象
		List unmodifiableList = Collections.emptyList();
		//创建一个只有一个元素、不可变的Set对象
		Set unmodifiableSet = Collections.singleton("高等数学");
		//创建一个普通的Map对象
		Map scores = new HashMap();
		scores.put("语文", 80);
		scores.put("英语", 87);
		//返回普通的Map对象对应的不可变版本
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//下面任意一行代码都将引起UnsupporttedOperationException异常
		unmodifiableList.add("测试元素");
		unmodifiableSet.add("测试元素");
		unmodifiableMap.put("语文", 90);
	}

}
