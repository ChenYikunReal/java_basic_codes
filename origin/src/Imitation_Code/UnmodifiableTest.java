package Imitation_Code;

import java.util.*;

public class UnmodifiableTest {
	public static void main(String[] args) {
		//����һ���յġ����ɱ��List����
		List unmodifiableList = Collections.emptyList();
		//����һ��ֻ��һ��Ԫ�ء����ɱ��Set����
		Set unmodifiableSet = Collections.singleton("�ߵ���ѧ");
		//����һ����ͨ��Map����
		Map scores = new HashMap();
		scores.put("����", 80);
		scores.put("Ӣ��", 87);
		//������ͨ��Map�����Ӧ�Ĳ��ɱ�汾
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		//��������һ�д��붼������UnsupporttedOperationException�쳣
		unmodifiableList.add("����Ԫ��");
		unmodifiableSet.add("����Ԫ��");
		unmodifiableMap.put("����", 90);
	}

}
