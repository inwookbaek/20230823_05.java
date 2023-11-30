package com.lec.pkg.getset;

import java.util.Date;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee user =  new Employee(10, "홍길동", "20001118"
				, 3000, 10, true, "19950101-1234567", true, false);
		
		System.out.println(user.is질병());

	}

}
