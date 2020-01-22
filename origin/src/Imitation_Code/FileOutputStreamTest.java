package Imitation_Code;

import java.io.*;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		try (//�����ֽ�������
			FileInputStream fis = new FileInputStream("FileOutputStreamTest.java");
			//�����ֽ�������
			FileOutputStream fos = new FileOutputStream("newFile.java")) {
			byte[] bbuf = new byte[32];
			int hasRead = 0;
			//ѭ������������ȡ������
			while ((hasRead = fis.read(bbuf)) > 0) {
				//ÿ��һ�Σ���д���ļ������������˶��٣���д����
				fos.write(bbuf, 0, hasRead);
			}
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
