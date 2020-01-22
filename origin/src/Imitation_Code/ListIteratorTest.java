package Imitation_Code;

import java.util.*;

public class ListIteratorTest {
	public static void main(String[] args) {
		String[] books = {"高等数学", "线性代数", "离散数学"};
		List bookList = new ArrayList();
		for (int i = 0; i <books.length; i++){
			bookList.add(books[i]);
		}
		ListIterator lit = bookList.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
			lit.add("----------分隔符----------");
		}
		System.out.println("========下面开始反向迭代========");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
