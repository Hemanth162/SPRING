package in.hemanth.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap_Demo {
	public static void main(String[] args) {
		List<String>languages = Arrays.asList("C#","Java","Python","Scala");
		List<String>ftech = Arrays.asList("html","css","Angular","React");
		List<List<String>> developer = Arrays.asList(languages,ftech);
		developer.stream().forEach(System.out::println);
		System.out.println("========================");
		
		Stream<String>s1 =developer.stream().flatMap(s->s.stream());
		s1.forEach(System.out::println);
	}

}
