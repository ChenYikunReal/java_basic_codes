package Imitation_Code;

import java.util.*;

public class SynchronizedTest {
	public static void main(String[] args) {
		//������򴴽���4���̰߳�ȫ�ļ��϶���
		Collection c = Collections.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set s  = Collections.synchronizedSet(new HashSet());
		Map p = Collections.synchronizedMap(new HashMap());
	}

}
