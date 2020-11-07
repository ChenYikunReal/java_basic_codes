package Imitation_Code;

import java.util.*;

public class ListTest {
	public static void main(String[] args) {
		List books = new ArrayList();
		//向books集合里添加三个元素
		books.add(new String("高等数学"));
		books.add(new String("线性代数"));
		books.add(new String("离散数学"));
		System.out.println(books);
		//将新字符串对象添加在第二个位置
		books.add(1, new String("物理概论"));
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		//删除第三个元素
		books.remove(2);
		System.out.println(books);
		//判断指定元素在List集合中的位置：输出1，表明位于第2位
		System.out.println(books.indexOf(new String("物理概论")));
		//将第二个元素替换成新的字符串对象
		books.set(1, new String("线性代数"));
		System.out.println(books);
		//将books集合的第二个元素（包括）到第三个元素截取成子集合
		System.out.println(books.subList(1, 2));
	}

}
