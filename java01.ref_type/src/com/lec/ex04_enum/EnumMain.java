package com.lec.ex04_enum;

public class EnumMain {

	public static void main(String[] args) {
		
		String name = "소향";
		String gender = "여자";
		
		// 열거타입을 사용하려면 '열거명.열거상수'형태로 사용
		Gender gender2 = Gender.FEMALE;
		
		// ssnd에서 7번째를 비교
		int sex = 4;
		if(sex==2 || sex==4) {
			System.out.println("이 사원의 성별은 " + Gender.MALE + "입니다");
		}

	}

}
