package predefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

//public class PredicateDemo {
//	public static void main(String[] args) {
//		Predicate<Integer>p = i ->i>10;
//		System.out.println(p.test(8));
//		System.out.println(p.test(25));
//	}
//
//}

//Stream creation: In 2 Ways
//1.Stream.of(e1,e2,e3,…)
//2.stream() method

//public class PredicateDemo {
//	public static void main(String[] args) 
//	{
//		Stream<Integer>st = Stream.of(10,25,4,56);
//		st.forEach(System.out::println);
//
//	}
//
//}

//public class PredicateDemo {
//	public static void main(String[] args) {
////		Stream<Integer>st = Stream.of(10,25,4,56);
////		st.forEach(System.out::println);
//		
//		Stream<Integer>st = Stream.of(10,25,4,56);
//		st.sorted().forEach(System.out::println);
//	}
//
//}

//					Stream creation by  2 nd Way
//						2.stream() method

public class PredicateDemo{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Hemanth");
		al.add("Hemu");
		al.add("HemanthHemu");
		
		Stream<String>sl =al.stream();
		sl.forEach(System.out::println);
		
	}
}

