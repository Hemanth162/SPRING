package in.hemanth;

import java.util.ArrayList;
import java.util.List;

//LAMBDA 8 EXPRESSION

//interface VTU
//{
//	public double fee (double fe);
//}
//public class Interface_demo {
//	public static void main(String[] args) {
//		VTU v =(fe) -> 
//		{
//			return fe+100;
//		};
//		System.out.println("fee amount =" +v.fee(3000.5));
//		
//	}
//
//}

//------------------------

//interface VTU
//{
//	public void display (String name);
//}
//public class Interface_demo {
//	public static void main(String[] args) {
//		VTU v =(n) -> 
//		{System.out.println("name="+n);
//		};
//		v.display("HEMANTH");
//		
//	}
//
//}

//OUTPUT:name=HEMANTH

//interface VTU
//{
//	double fee(int placement_fee,double govt_fee);
//}
//
//public class Interface_demo
//{
//	public static void main(String[] args) 
//	{
//		VTU v=(p,g)->
//		{
//			return p+g;
//		};
//		System.out.println("Total fees = "+v.fee(5415, 88880.5));
//	}
//	
//}

//--------------------------
//@FunctionalInterface
//interface gmit{
//	void show();
////	void add5();  //if we add another abstract method it will shows the CTC 
//}
//public class Interface_demo implements gmit
//{
//	public void show()
//	{
//		System.out.println("Welcome to gmit College for Class");
//	}
//	public static void main(String[] args)
//	{
//		gmit i = new Interface_demo();
//		i.show();
//		
//		gmit g = ()->
//		{
//			System.out.println("Welcome to gmit");
//		};
//		g.show();
//	}
//}

//-----------------
//interface VTU
//{
//	public String fee();
//}
//public class Interface_demo implements VTU
//{
//	@Override
//	public String fee (){
//		return null;
//
//	}
//	public static void main(String[] args) {
//		VTU v=()->{return "fee is 60k";};
//		System.out.println(v.fee());
//	}
//}

//public class Interface_demo{
//	public static void main(String...args)
//	{
//		Runnable r = new Runnable() 
//		{
//		
//			@Override
//			public void run() 
//			{
//				// TODO Auto-generated method stub
//				System.out.println("Functional Interface ");
//			}
//		};
//		Runnable th =()->System.out.println("java");
//		
//		new Thread(th).start();
//		new Thread(r).start();
//	}
//}

//------------------------
public class Interface_demo
{
	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("Hemanth");
		list.add("Car");
		list.add("Bike");
		
		list.forEach(n ->System.out.println(n));
		list.forEach(System.err::println);
	}
}
