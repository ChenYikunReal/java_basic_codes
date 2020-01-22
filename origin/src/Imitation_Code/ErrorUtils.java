package Imitation_Code;

//import java.util.List;
import java.util.*;

public class ErrorUtils {
	public static void faultyMethod(List<String>... listStrArray) {
		//Java语言不允许创建泛型数组，因此listArray只能被当成list[]处理
		//此时相当于把list<String>赋给了List，已经发生了“堆污染”
		List[] listArray = listStrArray;
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(new Random().nextInt(100));
		//把ListArray的第一个元素赋为myArray
		listArray[0] = myList;
		String s = listStrArray[0].get(0);
	}

}
