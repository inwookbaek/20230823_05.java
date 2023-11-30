package java10.stream.ex02_kind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFilesMain {

	public static void main(String[] args) throws IOException {
		// 4. Files에서 stream을 얻는 방법
		Stream<String> stream = null;
		
		// 1) 파일위치
		Path path = Paths.get("./src/java10/stream/ex02_kind/database.txt");
		System.out.println(path);
		System.out.println();
		
		// 2) 파일읽기(1) - java.nio.file.Files.lines()
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out::println);
		System.out.println();
		
		// 3) 파일읽기(2) - java.io.BufferedReader.lines()
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out::println);
		System.out.println();
		br.close();
		fileReader.close();	
	}
}
