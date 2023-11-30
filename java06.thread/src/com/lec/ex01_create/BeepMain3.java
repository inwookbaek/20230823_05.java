package com.lec.ex01_create;

import java.awt.Toolkit;

import javax.swing.TransferHandler;

public class BeepMain3 {

	public static void main(String[] args) throws Exception {
		
		// Thread 객체를 만드는 방법
		// 1) Thread를 상속받은 클래스를 작성
		// 2) Thread객체생성
		// 3) thread.start()
		
		// 1. 외부클래스생성(Thread를 상속)
//		Thread thread1 = new BeepTask2();
//		thread1.start();
		
		// 2. 익명객체생성
		Thread thread2 = new Thread() {
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
		};
		thread2.start();
				
		// 띵문자출력
		for(int i=0;i<5;i++) {
			System.out.println("띵~~~~");
			Thread.sleep(1000); // 1초
		}	
	}
}

class BeepTask2 extends Thread {

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