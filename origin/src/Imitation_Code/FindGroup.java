package Imitation_Code;

import java.util.regex.*;

public class FindGroup{
	public static void main(String[] args){
		//ʹ���ַ���ģ������ϵõ�������Դ��
		String str = "������һ�������Java���塷��������ϵ��13500006666"
				+ "�����ѣ��绰������13611125565"
				+ "���۶��ֵ��ԣ���ϵ��ʽ15899903312";
		//System.out.println(str);
		//����һ��Pattern���󣬲���������һ��Matcher����
		//��������ʽֻץȡ13X��15X���ֻ���
		//ʵ����Ҫץȡ��Щ���ʽ��ֻҪ�޸�������ʽ����
		Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
		//Pattern p = Pattern.compile("(13\\d) | (15\\d)");
		//Matcher m = p.matcher(str);
		//boolean b = m.matches();
		//System.out.println(b);
		//�����з���������ʽ���Ӵ����绰���룩ȫ�����
		while (m.find()){
			System.out.println("����Ҫ��ĵ绰�����ǣ�" +m.group());
		}
	}
}