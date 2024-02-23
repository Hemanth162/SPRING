package in.hemanth.streamexample;

import java.util.Arrays;
import java.util.List;

public class Map_Demo1 {
	public static void main(String[] args) {
		List<String>names = Arrays.asList("Kiran","Karthik","arun","varun");
		names.stream().map(k->k.toUpperCase()).forEach(System.out::println);
		System.out.println("-----------------------");
		
		names.stream().mapToInt(k->k.length()).forEach(System.out::println);
		
//		names.stream().filter(n->n.startsWith("a"))
		
		
	}

}
