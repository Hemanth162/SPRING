package in.hemanth.streamexample;

import java.util.stream.Stream;

public class Stream_Filter_demo2 {
	public static void main(String[] args) {
		User u1 = new User("Kiran", 10);
		User u2 = new User("varun", 15);
		User u3 = new User("arun", 25);
		User u4 = new User("kavya", 35);
		User u5 = new User("punith", 40);
		Stream<User>stream =Stream.of(u1,u2,u3,u4,u5);
		stream.filter(k ->k.age>15 && k.name.startsWith("k")).forEach(System.out::println);
	}

}
