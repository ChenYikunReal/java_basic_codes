package Imitation_Code;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) throws IOException{
		try (
			//�����ַ�������
			FileReader fr = new FileReader("FileReaderTest.java")) {
			//����һ������Ϊ32�ġ���Ͳ��
			char[] cbuf = new char[32];
			//���ڱ���ʵ�ʶ�ȡ���ַ���
			int hasRead = 0;
			//ʹ��ѭ�����ظ���ȡˮ������
			while ((hasRead = fr.read(cbuf)) > 0) {
				//ȡ������Ͳ�����ˮ�Σ��ַ��������ַ�����ת�����ַ������
				System.out.println(new String(cbuf, 0, hasRead));
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}