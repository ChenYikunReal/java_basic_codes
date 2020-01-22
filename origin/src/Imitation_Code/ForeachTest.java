package Imitation_Code;
import java.util.*;
public class ForeachTest {
	public static void main(String[] args) {
		//创建集合，添加元素的操作与前一个程序一样
		//创建一个集合
		Collection books = new HashSet();
		books.add("高等数学");
		books.add("线性代数");
		books.add("离散数学");
		for (Object obj : books) {
			//此处的book变量也不是集合本身
			String book = (String)obj;
			System.out.println(book);
			if (books.equals("离散数学")) {
				//代码将引发ConcurrentModificationException异常
				books.remove(book);
			}
		}
		System.out.println(books);
	}
}
