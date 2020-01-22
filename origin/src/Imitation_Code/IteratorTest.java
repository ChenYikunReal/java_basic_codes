package Imitation_Code;

import java.util.*;

public class IteratorTest {
	public static void main(String[] args) {
		//创建集合，添加元素的操作与前一个程序一样
		//创建一个集合
		Collection books = new HashSet();
		books.add("高等数学");
		books.add("线性代数");
		books.add("离散数学");
		//获取books集合对应的迭代器
		Iterator it = books.iterator();
		while (it.hasNext()) {
			//it.next()方法返回的数据类型是Object类型，因此需要强制类型装换
			String book = (String)it.next();
			System.out.println(book);
			if (book.contentEquals("高等数学")) {
				//从集合中删除上一次next()方法返回的元素
				it.remove();
			}
			//对book变量赋值，不会改变集合元素本身
			book = "测试字符串";
		}
		System.out.println(books);
	}
}
