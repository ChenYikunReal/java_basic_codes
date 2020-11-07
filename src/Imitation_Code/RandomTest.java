package Imitation_Code;

import java.util.*;

public class RandomTest{
	public static void main(String[] args){
		Random rand = new Random();
		System.out.println("rand.nextBoolean():" + rand.nextBoolean());
		byte[] buffer = new byte[16];
		rand.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		//����0.0~1.0֮���α���double��
		System.out.println("rand.nextDouble():" + rand.nextDouble());
		//����0.0~1.0֮���α���float��
		System.out.println("rand.nextFloat():" + rand.nextFloat());
		//����ƽ��ֵΪ0.0����׼��Ϊ1.0��α��˹��
		System.out.println("rand.nextGaussian():" + rand.nextGaussian());
		//����һ������int����ȡֵ��Χ�ڵ�α�������
		System.out.println("rand.nextInt():" + rand.nextInt());
		//����0~26֮���α�������
		System.out.println("rand.nextInt():" + rand.nextInt());
		//����һ������long����ȡֵ��Χ�ڵ�α�������
		System.out.println("rand.nextLong():" + rand.nextLong());
	}
}