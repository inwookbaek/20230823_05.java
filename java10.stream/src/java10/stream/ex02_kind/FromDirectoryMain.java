package java10.stream.ex02_kind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryMain {

	public static void main(String[] args) throws IOException {
		
		// 5. directory에서 stream얻기
		Path path = Paths.get("./src/java10/stream/ex02_kind");
		Stream<Path> stream = Files.list(path);
		stream.forEach(System.out::println);
		System.out.println();
		
		stream = Files.list(path);
		stream.forEach(f -> System.out.println(f.getFileName()));
		System.out.println();
		
		stream = Files.list(path);
		stream.forEach(f -> System.out.println(
				f.getName(0) + ", " + 
				f.getName(1) + ", " + 
				f.getName(2) + ", " + 
				f.getName(3) + ", " + 
				f.getName(4) + ", " + 
				f.getName(5) + ", " + 
				f.getNameCount()));	

	}

}
