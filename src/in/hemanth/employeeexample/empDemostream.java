package in.hemanth.employeeexample;

import java.util.stream.Stream;

public class empDemostream {
	public static void main(String[] args) {
		Employee e1 = new Employee("karthik", 20, 10000.0);
		Employee e2 = new Employee("Kiran", 25, 52451.0);
		Employee e3 = new Employee("Varun", 30, 84575.0);
		Employee e4 = new Employee("arun", 30,8545.2);
		
//		Stream<Employee>s1 = Stream.of(e1,e2,e3,e4);
//		s1.filter(k->k.sal>10000).map(k->k.name+"-"+k.age).forEach(System.out::println);
System.out.println("=====================");
		Stream<Employee>s1 = Stream.of(e1,e2,e3,e4);
		s1.filter(k->k.sal>10000.0).forEach(k -> System.err.println(k.name+"-"+k.age));
		
		
	}
}