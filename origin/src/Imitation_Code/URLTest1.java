package Imitation_Code;

import java.net.URL;

public class URLTest1 {
	public static void main(String[] args) throws Exception{
		String str = "http://www.chinasei.com/article";
		URL url = new URL(str);
		System.out.println("Э��Ϊ��" + url.getProtocol());
		System.out.println("����Ϊ��" + url.getHost());
		System.out.println("�ļ�Ϊ��" + url.getFile());
		System.out.println("·��Ϊ��" + url.getPath());
	}

}
