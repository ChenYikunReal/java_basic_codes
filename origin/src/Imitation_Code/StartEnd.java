package Imitation_Code;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StartEnd {
	public static void main(String[] args) {
		//����һ��Person���󣬲���������һ��Matcher����
		String regStr = "Java is very easy!";
		System.out.println("Ŀ���ַ����ǣ�" + regStr);
		Matcher m = Pattern.compile("\\w+").matcher(regStr);
		while(m.find()) {
			System.out.println(m.group() + "�Ӵ�����ʼλ�ã�" + m.start() + "�������λ�ã�" + m.end());
		}
	}

}