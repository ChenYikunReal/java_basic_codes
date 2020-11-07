package Imitation_Code;

import java.util.*;

import static java.util.Calendar.*;
public class LenientTest{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		//结果是YEAR字段+1，MONTH字段为1（2月）
		cal.set(MONTH, 13);
		System.out.println(cal.getTime());
		//关闭容错性
		cal.setLenient(false);
		//导致运行时异常
		cal.set(MONTH, 13);
		System.out.println(cal.getTime());
	}
}