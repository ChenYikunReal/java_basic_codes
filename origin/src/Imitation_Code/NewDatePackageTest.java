package Imitation_Code;

import java.time.*;
import java.util.*;

public class NewDatePackageTest{
	public static void main(String[] args){
		//-----�����ǹ���Clock���÷�-----
		System.out.println("-----�����ǹ���Clock���÷�-----");
		//��ȡ��ǰClock
		Clock clock = Clock.systemUTC();
		//ͨ��Clock��ȡ��ǰʱ��
		System.out.println("��ǰʱ��Ϊ��" + clock.instant());
		//��ȡclock��Ӧ�ĺ���������System.currentTimeMillis()�����ͬ
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());

		//-----�����ǹ���Duration���÷�-----
		System.out.println("-----�����ǹ���Duration���÷�-----");
		Duration d = Duration.ofSeconds(6000);
		System.out.println("6000���൱��" + d.toMinutes() +"��");
		System.out.println("6000���൱��" + d.toHours() +"Сʱ");
		System.out.println("6000���൱��" + d.toDays() +"��");
		//��clock�Ļ������ټ���6000�룬�����µ�Clock
		Clock clock2 = Clock.offset(clock, d);
		//���Կ���clock2��clock1���1Сʱ40����
		System.out.println("��ǰʱ�̼�6000��Ϊ��" + clock2.instant());

		//-----�����ǹ���Instant���÷�-----
		System.out.println("-----�����ǹ���Instant���÷�-----");
		//��ȡ��ǰʱ��
		Instant instant = Instant.now();
		System.out.println(instant);
		//instant���6000�루��100���ӣ��������µ�Instant
		Instant instant2 = instant.plusSeconds(6000);
		System.out.println(instant2);
		//�����ַ�������Instant����
		Instant instant3 = Instant.parse("2019-03-20T17:15:00.342z");
		System.out.println(instant3);
		//��instant3�Ļ��������5Сʱ4����
		Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
		System.out.println(instant4);
		//��ȡinstant4������ǰ��ʱ��
		Instant instant5 = instant4.minus(Duration.ofDays(5));
		System.out.println(instant5);

		//-----�����ǹ���LocalDate���÷�-----
		System.out.println("-----�����ǹ���LocalDate���÷�-----");
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		//��ȡ2019��ĵ�111��
		localDate = LocalDate.ofYearDay(2019, 111);
		System.out.println(localDate);
		//����Ϊ2019��5��1��
		localDate = LocalDate.of(2019, Month.MAY, 1);
		System.out.println(localDate);
		//����Ϊ2019��11��11��
		localDate = LocalDate.of(2019, Month.SEPTEMBER, 11);
		System.out.println(localDate);

		//-----�����ǹ���LocalTime���÷�-----
		System.out.println("-----�����ǹ���LocalTime���÷�-----");
		//��ȡ��ǰʱ��
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		//����Ϊ22��30��
		localTime = LocalTime.of(22, 30);
		System.out.println(localTime);
		//����һ���еĵ�5555��
		localTime = LocalTime.ofSecondOfDay(5555);
		System.out.println(localTime);

		//-----�����ǹ���LocalDateTime���÷�-----
		System.out.println("-----�����ǹ���LocalTime���÷�-----");
		//��ȡ��ǰ���ڡ�ʱ��
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		//��ǰ���ڡ�ʱ��Ļ��������25Сʱ3����
		LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
		System.out.println("��ǰ���ڡ�ʱ���25Сʱ3�����Ժ�" + future);

		//-----�����ǹ���Year��YearMonth��MonthDay���÷�ʾ��-----
		System.out.println("-----�����ǹ���Year��YearMonth��MonthDay���÷�ʾ��-----");
		Year year = Year.now();			//��ȡ��ǰ���
		System.out.println("��ǰ��ݣ�" + year);		//�����ǰ���
		year = year.plusYears(5);			//��ǰ����ټ�����
		System.out.println("��ǰ����ٹ����꣺" + year);	//��������Ժ�����
		//����ָ���·ݻ�ȡYearMonth
		YearMonth ym = year.atMonth(10);
		System.out.println("year��10�£�" + ym);
		//��ǰ�����ټ�5���ټ�3����
		ym = ym.plusYears(5).minusMonths(3);
		System.out.println("year��10���ټ�5���ټ�3���£�" + ym);
		MonthDay md = MonthDay.now();
		System.out.println("��ǰ���գ�" + md);
		//����Ϊ6��8��
		MonthDay md2 = md.with(Month.JUNE).withDayOfMonth(8);
		System.out.println("6��8��Ϊ��" + md2);
	}
}