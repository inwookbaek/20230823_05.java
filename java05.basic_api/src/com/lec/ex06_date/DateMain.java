package com.lec.ex06_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateMain {

	public static void main(String[] args) {
		
		// 1. Date class
		Date now = new Date();
		System.out.println(now.toString());
		
		// 날짜형식 : SimpleDateFormat
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf1.format(now));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		System.out.println(sdf2.format(now));
		
		// 2. Calendar class
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "." + month + "." + day);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		switch(week) {
		case Calendar.MONDAY: System.out.println("월요일(" + week + ")"); break;
		case Calendar.TUESDAY: System.out.println("화요일(" + week + ")"); break;
		case Calendar.WEDNESDAY: System.out.println("수요일(" + week + ")"); break;
		case Calendar.THURSDAY: System.out.println("목요일(" + week + ")"); break;
		case Calendar.FRIDAY: System.out.println("금요일(" + week + ")"); break;
		case Calendar.SATURDAY: System.out.println("토요일(" + week + ")"); break;
		case Calendar.SUNDAY: System.out.println("일요일(" + week + ")"); break;
		}
		
		int ampm = cal.get(Calendar.AM_PM);
		if(ampm == Calendar.AM) {
			System.out.println("오전입니다.");
		} else {
			System.out.println("오후입니다.");
		}
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(hour + ":" + minute + ":" + second);
		
		// 다른 지역의 시간대의 날짜와 시간 구하기
		// java.util.TimeZone객체를 얻어서 Calendar.getInstance()메서드의
		// 매게값으로 전달
		// 사용가능한 시간대(TimeZone)
		String[] timeZoneId = TimeZone.getAvailableIDs();
		for(String id:timeZoneId) {
			System.out.println(id);
		}	
	}

}












