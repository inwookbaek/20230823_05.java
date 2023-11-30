package com.lec.ex05_bounded;



/*
	제한된 파리미터(제네릭타입을 제한)
	1. <T extends 상위타입> : 상위타입을 상속한 모든 자식타입만 허용
	2. <T super 하위타입>   : 하위타입이 상속한 모든 부모타입만 허용
	
*/
public class BoundedMain {

	public static void main(String[] args) {
		
		int result = Util.compare(10, 10);
		result = Util.compare(10f, 10f);
		result = Util.compare(10l, 10l);
		result = Util.compare(10d, 10);
		
//		result = Util.compare(10d, "10");
	}

}

class Util {
	
	public static <T extends Number> int compare(T t1, T t2) {
		Double x = t1.doubleValue();
		Double y = t2.doubleValue();
		return Double.compare(x, y);
	}
}