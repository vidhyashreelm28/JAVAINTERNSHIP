package Stactic;

public class static1 {

	private static int a;
	private int b;
	public static void m1() {
		System.out.println(b); // #Error- non static members cannot accessed in static method
	}
	public void m2() {
		System.out.println(b); 
		System.out.println(a);   //non static method can access both the static and non static member
		m1();
	}
\
	static {
		System.out.println("Hi");

	}
	
	public static void main(String[] args)
	{
		m1();
		m2();
	}
}
