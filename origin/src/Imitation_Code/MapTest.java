package Imitation_Code;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		//�ɶԷ�����key-value��
		map.put("�ߵ���ѧ", 100);
		map.put("��ɢ��ѧ", 100);
		map.put("�������", 100);
		//��η����key-value����value�����ظ�
		map.put("������������ƻ���", 100);
		System.out.println(map);
		//�����ظ���keyʱ���µ�value�Ḳ��ԭ�е�value
		//����µ�value������ԭ�е�value���÷������ر����ǵ�value
		System.out.println(map.put("��ɢ��ѧ", 99));	//���10
		System.out.println(map);	//���Map���ϰ���4��key-value��
		//�ж��Ƿ����ָ����key
		System.out.println("�Ƿ����ֵΪ ��ɢ��ѧ key��" + map.containsKey("��ɢ��ѧ"));	//���true
		//�ж��Ƿ����ָ����value
		System.out.println("�Ƿ����ֵΪ ��ɢ��ѧ value��" + map.containsValue(99));	//���true
		//��ȡMap��������key��ɵļ��ϣ�ͨ������key��ʵ�ֱ������е�key-value��
		for (Object key : map.keySet()) {
			//map.get(key)������ȡָ����value
			System.out.println(key + "---->" + map.get(key));
		}
		//����keu��ɾ��key-value��
		map.remove("������������ƻ���");
		//���������ٰ��� ������������ƻ���=100 ��key-value��
		System.out.println(map);
	}

}
