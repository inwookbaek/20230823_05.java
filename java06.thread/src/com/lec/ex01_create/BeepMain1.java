package com.lec.ex01_create;

import java.awt.Toolkit;

public class BeepMain1 {

	public static void main(String[] args) throws Exception {
		
		// 띵소리출력
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 스피커자원
		for(int i=0;i<5;i++) {
			toolkit.beep();
			Thread.sleep(1000); // 1초
		}
		
		// 띵문자출력
		for(int i=0;i<5;i++) {
			System.out.println("띵~~~~");
			Thread.sleep(1000); // 1초
		}
	}

}
