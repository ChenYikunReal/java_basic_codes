package Imitation_Code;

//import java.util.List;
import java.util.*;

public class ErrorUtils {
	public static void faultyMethod(List<String>... listStrArray) {
		//Java���Բ��������������飬���listArrayֻ�ܱ�����list[]����
		//��ʱ�൱�ڰ�list<String>������List���Ѿ������ˡ�����Ⱦ��
		List[] listArray = listStrArray;
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(new Random().nextInt(100));
		//��ListArray�ĵ�һ��Ԫ�ظ�ΪmyArray
		listArray[0] = myList;
		String s = listStrArray[0].get(0);
	}

}
