package Imitation_Code;

import java.util.Date;

public class DateTest{
	public static void main(String[] args){
		Date d1 = new Date();
		//获取当前时间之后100ms的时间
		Date d2 = new Date(System.currentTimeMillis() + 100);
		System.out.println(d2);
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.before(d2));
	}
}