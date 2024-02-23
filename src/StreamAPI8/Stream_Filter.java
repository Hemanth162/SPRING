package StreamAPI8;

import java.util.Arrays;
import java.util.List;

public class Stream_Filter {
	public static void main(String[] args) {
		List<Integer>al = Arrays.asList(10,59,87,40);
		al.stream().filter(k ->k>10).forEach(System.out::println);		
	}

}
