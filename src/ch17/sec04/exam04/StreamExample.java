package ch17.sec04.exam04;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line));
		stream.close();  // 파일스트림이나 네트워크 스트림 등의 리소스를 다루는 것은 리소스 정리를 위해 반드시 close()를 호출해줘야한다.
		// 리소스 정리가 없다면 메모리 누수와 같은 문제가 발생 할 수 있다.
	}

}
