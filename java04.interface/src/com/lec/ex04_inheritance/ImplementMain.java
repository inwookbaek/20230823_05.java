package com.lec.ex04_inheritance;

public class ImplementMain {

	public static void main(String[] args) {
		
		ImplementC im = new ImplementC();
		im.methodA();
		im.methodB();
		im.methodC();
		System.out.println();
		
		// 형변환
		InterfaceA ia = im;
		ia.methodA();
		// ia.methodB();
		// ia.methodC();
		System.out.println();
		
		InterfaceB ib = im;
		// ib.methodA();
		ib.methodB();
		//ib.methodC();
		System.out.println();
		
		InterfaceC ic = im;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
