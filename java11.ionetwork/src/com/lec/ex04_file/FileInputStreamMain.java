package com.lec.ex04_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamMain {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("src/com/lec/ex04_file/FileMain.java");
		int data;
		while((data = fis.read()) != -1) {
			System.out.println((char) data);
		}
		fis.close();
	}

}
