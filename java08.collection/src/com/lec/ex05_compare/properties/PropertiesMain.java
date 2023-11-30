package com.lec.ex03_map.properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

/*
	Propertis는 HashTable의 하위 클래스이기 때문에 HashTable의 모든 속성을
	그대로 가지고 있다. 차이점은 HashTable의 키와 값은 모두 객체이어야 하지만
	Properties는 키와 값의 참조타입은 오직 String으로 제한된 Map Collection이다.
	
	Propertis는 db접속정보, 다국어(국제화)정보를 정의할 때 주로 사용한다.
	한글은 유니코드(문자셋 ISO8859-1)로 변환되어 저장된다.
*/
public class PropertiesMain {

	public static void main(String[] args) throws Exception  {
		// Propertis파일 읽기
		// 1. 경로확인
		String path = PropertiesMain.class.getResource("database.properties").getPath();
		// 경로명에 한글이 있을 경우 decoding해야 한다. 아니면 UnsupportedEncodingException발생
		path = URLDecoder.decode(path, "utf-8");
		System.out.println("파일의 경로 = " + path);
		System.out.println();
		
		// 2. 파일읽기
		Properties properties = new Properties();
		properties.load(new FileReader(path)); // 파일미검색시 IOException, FileNotfoundException
		
		// 3. key로 value를 읽기
		String drv = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String usr = properties.getProperty("user");
		String pwd = properties.getProperty("password");
		String adm = properties.getProperty("hangul");
		String xxx = properties.getProperty("xxx");

		System.out.println(drv);
		System.out.println(url);
		System.out.println(usr);
		System.out.println(pwd);
		System.out.println(adm);
		System.out.println(xxx);
		System.out.println();
		
		String mysql_drv = properties.getProperty("mysql_drv");
		String login = properties.getProperty("login");
		System.out.println(mysql_drv);
		System.out.println(login);		
	}

}












