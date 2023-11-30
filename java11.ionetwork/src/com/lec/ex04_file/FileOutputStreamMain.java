package com.lec.ex04_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception {
		
		String org_img = "src/com/lec/ex04_file/blackpink_02.jpg";
		String new_img = "src/com/lec/ex04_file/blackpink_copy.jpg";
		
		FileInputStream fis = new FileInputStream(org_img);
		FileOutputStream fos = new FileOutputStream(new_img);
		
		int readByte;
		byte[] readBytes = new byte[100];
		
		while((readByte = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByte);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("파일이 성공적으로 다운로드 되었습니다!");

	}

}
