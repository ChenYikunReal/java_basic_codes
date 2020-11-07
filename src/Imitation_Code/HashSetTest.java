package Imitation_Code;

import java.util.*;

class AA {
	public boolean equals(Object obj) {
		return true;
	}
}

class BB {
	public int hashCode() {
		return 1;
	}
}

class CC {
	public int hashCode() {
		return 2;
	}
	public boolean equals(Object obj) {
		return true;
	}
}

public class HashSetTest {
	public static void main(String[] args) {
		HashSet books = new HashSet();
		//分别向books集合添加两个A对象、两个B对象、两个C对象
		books.add(new AA());
		books.add(new AA());
		books.add(new BB());
		books.add(new BB());
		books.add(new CC());
		books.add(new CC());
		System.out.println(books);
	}
}
