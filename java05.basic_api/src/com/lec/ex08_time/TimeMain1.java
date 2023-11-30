package com.lec.ex08_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TimeMain1 {

	public static void main(String[] args) throws Exception {
		// Java V1.7이전까지는 Date, Calendar클래스를 이용하여 시간정보를 얻을 수 있었다.
		// 그 이후 버전에서는 java.time.* 패키지에서 다양한 기능을 지원한다.
		
		// 1. 날짜
		LocalDate currDate = LocalDate.now();
		System.out.println("현재일자 = " + currDate);
		LocalDate targetDate = LocalDate.of(2024, 11, 23);
		System.out.println("목표일자 = " + targetDate);
		
		// 2. 시간
		LocalDateTime currDateTime = LocalDateTime.now();
		LocalDateTime targetDateTime = LocalDateTime.of(2021, 11,23, 12, 00, 00, 2121);
		System.out.println("현재시간 = " + currDateTime);
		System.out.println("목표시간 = " + targetDateTime);
		
		// 3. TimeZone
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("세계협정시간 = " + utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("대한민국시간 = " + seoulDateTime);
		
		
		// 4. 타임스탬프
		Instant instant1 = Instant.now();
		Thread.sleep(10); // 10초간 정지
		Instant instant2 = Instant.now();
		
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1이 instant2 시간보다 빠릅니다!");
		} else if(instant1.isAfter(instant2)) {
			System.out.println("instant1이 instant2 시간보다 늦습니다!");
		} else {
			System.out.println("instant1와 instant2 시간이 같습니다!");
		}
		System.out.println("시간차이(nano) : " + instant1.until(instant2, ChronoUnit.NANOS));	
	}
}









