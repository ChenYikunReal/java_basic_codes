package Imitation_Code;

import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

public class ZoomImage {
	// ������������������С��ͼƬ�Ĵ�С
		private final int WIDTH = 80;
		private final int HEIGHT = 60;
		// �����BuffedImage�������ڱ�����С���λͼ
		BufferedImage image = new BufferedImage(WIDTH , HEIGHT, BufferedImage. TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		public void zoom()throws Exception{
			// ��ȡԭʼλͼ
			Image srcImage = ImageIO.read(new File("C:\\Users\\yk\\eclipse-workspace\\���Java����\\src\\Java_2019_04_08\\image\\board.jpg"));
			// ��ԭʼλͼ��С����Ƶ�imageͼ����
			g.drawImage(srcImage , 0 , 0 , WIDTH , HEIGHT , null);
			// ��imageͼ���ļ�����������ļ��С�
			ImageIO.write(image , "jpeg", new File(System.currentTimeMillis() + ".jpg"));
		}
		public static void main(String[] args)throws Exception{
			new ZoomImage().zoom();
		}
}
