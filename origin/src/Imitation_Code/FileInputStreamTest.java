package Imitation_Code;

import java.io.*;

public class FileInputStreamTest {
	public static void main(String[] args) throws IOException{
		//�����ֽ�������
		FileInputStream fis = new FileInputStream("FileInputStream.java");
		//����һ������Ϊ1024�ġ���Ͳ
		byte[] bbuf = new byte[1024];
		//���ڱ���ʵ�ʶ�ȡ���ֽ���
		int hasRead = 0;
		//ʹ��ѭ�����ظ���ȡˮ������
		while ((hasRead = fis.read(bbuf)) > 0) {
			//ȡ������Ͳ���е�ˮ�Σ��ֽڣ������ֽ�����ת�����ַ�������
			System.out.println(new String(bbuf, 0, hasRead));
		}
		//�ر��ļ�������������finally�������ȫ
		fis.close();
	}

}
