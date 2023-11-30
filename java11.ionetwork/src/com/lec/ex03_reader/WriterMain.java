package com.lec.ex03_reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterMain {

	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("src/com/lec/ex03_reader/text1.txt");
		char[] data = "대한민국만세".toCharArray();
		for(int i=0;i<data.length;i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();

		writer = new FileWriter("src/com/lec/ex03_reader/text2.txt");
		data = "우리나라만세".toCharArray();
		writer.write(data, 1, 2);
		writer.flush();
		writer.close();		
	}

}
