package com.lec.ex07_format;

import java.text.DecimalFormat;

public class DecimalFormatMain {

	public static void main(String[] args) {
		
		double num = 12345678.90;
		DecimalFormat df = new DecimalFormat();
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.00");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.##");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.00");
		System.out.println(df.format(num));

	}

}
