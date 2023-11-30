package com.lec.ex01_create;

import java.awt.Toolkit;

public class BeepMain2 {

	public static void main(String[] args) throws Exception {
		
		// Thread 객체를 만드는 방법
		// 1) Runnable을 구현한 클래스를 작성
		// 2) thread 객체를 생성
		// 3) tread.start()
		
		// 1. 외부에서 객체를 생성방법(Runnable객체를 생성)
//		Runnable beepTask = new BeepTask1();
//		Thread thread1 = new Thread(beepTask); // 쓰레드객체		
//		thread1.start();
				
		// 2. 익명객체로 만드는 방법(Runnable 인터페이스)
//		Thread thread2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit(); // 스피커자원
//				for(int i=0;i<5;i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}		
//			}
//		});
//		thread2.start();
		
		// 3. 람다식(Lambda) : Javascript의 화살표함수와 유사
		// 람다식은 @FunctionalInterface로 선언된 interface만 사용가능, 
		// @FunctionalInterface는 실행메서드(추상)가 오직 1개만 선언된 interface이다.
		Thread thread3 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit(); // 스피커자원
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}			
		});
		thread3.start();
		
		// 띵문자출력
		for(int i=0;i<5;i++) {
			System.out.println("띵~~~~");
			Thread.sleep(1000); // 1초
		}		
	}

}

class BeepTask1 implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 스피커자원
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}






