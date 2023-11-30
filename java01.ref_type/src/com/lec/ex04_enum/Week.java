package com.lec.ex04_enum;

// enum은 열거타입 - 한정된 값만 가지는 참조타입
// 예를 들어 
// 1. 요일에 대한 데이터는 월~일이라는 한정된 값
// 2. 계절에 대한 데이터는 봄,여름,가을,겨울이라는 한정된 값
// 열거타입은 상수의 성격을 가지기 때문에 대문자로 선언하고 스네이크방식을 준수(관례)

public enum Week {
	MONDAY,
	THUSDAY,
	WENDSDAY,
	THURDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY	
}