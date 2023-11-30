package com.lec.ex01_system;

import java.util.Properties;
import java.util.Set;

public class GetPropertyMain {

	public static void main(String[] args) {
		// 시스템속성읽기
		// getProperty(), getProperties()
		
		String os_name = System.getProperty("os.name");
		String user_name = System.getProperty("user.name");
		String user_home = System.getProperty("user.home");
			
		System.out.println("운영체제의 이름 = " + os_name);
		System.out.println("사용자     이름 = " + user_name);
		System.out.println("사용자홈디렉토리= " + user_home);

		// 시스템의 속성
		System.out.println("----------------------------");
		System.out.println("    [key]         [value]   ");
		System.out.println("----------------------------");
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object key:keys) {
			String keyValue = (String) key;
			String value = System.getProperty(keyValue);
			System.out.println("[" + keyValue + "] = " + value);
		}
	}

}
