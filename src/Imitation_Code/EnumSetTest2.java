package Imitation_Code;

import java.util.*;

public class EnumSetTest2 {
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.clear();
		c.add(Season.AUTUMN);
		c.add(Season.SPRING);
		//复制Collection集合中的所有元素来创建EnumSet集合
		EnumSet enumSet = EnumSet.copyOf(c);
		System.out.println(enumSet);
		c.add("高等数学");
		c.add("离散数学");
		//下面代码出现异常：因为c集合里的元素不是全部都为枚举值
		enumSet = EnumSet.copyOf(c);
	}

}
