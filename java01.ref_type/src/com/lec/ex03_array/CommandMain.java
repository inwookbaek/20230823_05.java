package com.lec.ex03_array;

public class CommandMain {

	public static void main(String[] args) {
		// 외부에서 java 실행방법(매개변수전달 방법
		// 커맨드창 : c:\>java CommanMain 손흥민 이강인 김민재
		System.out.println(args.length);

		
		if(args.length < 5) {
			System.out.println("배열의 크기 = " + args.length);
			System.out.println("프로그램 강제종료!!");
			System.exit(0);  // 관례적으로 0은 정상종료, 이외의 값은 비정상종료를 의미
		}
		
		for(String name : args) {
			System.out.println(name);
		}
		
	}

}
