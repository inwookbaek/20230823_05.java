package com.lec.ex03_String;

public class StringMethodMain1 {

	public static void main(String[] args) {
		// 1. replace
		String old_str = "자바 프로그램";
		String new_str = old_str.replace("자바", "파이썬");
		System.out.println(old_str + " : " + new_str);
		
		// 2. substring
		// (int begin, int end-1) / (int begin)
		String ssn = "991118-4234567";
		String birthday = ssn.substring(0, 6);
		System.out.println("생년월일 = " + birthday);
		System.out.println("주민일련번호 = " + ssn.substring(7));
		System.out.println();
		
		// 3. trim
		String tel1 = "      02";
		String tel2 = "9999    ";
		String tel3 = "  02 8888  ";
		System.out.println(tel1.trim() + ", " + tel2.trim() + ", " + tel3.trim());
		System.out.println();
		
		// 4. valueOf : int, double을 문자열로, String을 Integer, Double등으로 변환함수
		String val1 = String.valueOf(false);
		String val2 = String.valueOf(10);
		String val3 = String.valueOf(3.141592);
		System.out.println("false = " + val1 + ", " +  val1.getClass());
		System.out.println("10 = " + val2 + ", " +  val2.getClass());
		System.out.println("3.14 = " + val3 + ", " +  val3.getClass());
		System.out.println();
		
		// 5. charAt
		char gender = ssn.charAt(7);
		System.out.println(gender == '1' ? "남자" : (gender == '3' ? "남자" : "여자"));
		System.out.println();
		
		// 6. getBytes() or  getBytes(문자셋) - utf-9, euc-kr
		String str = "안녕하세요?";
		byte[] b1 = str.getBytes();
		System.out.println("bytes.length = " + b1.length);
			
		// 7. indexOf - 해당문자열의 위치를 리턴, 문자열이 없을 경우 -1을 리턴
		String title = "매개값으로 주어진 문자열이 시작되는 위치";
		int loc = title.indexOf("문자열");
		System.out.println("문자열의 위치 = " + loc);
		loc = title.indexOf("이강인");
		System.out.println("이강인의 위치 = " + loc);
	}
}