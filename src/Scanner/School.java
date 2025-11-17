package Scanner;

public class School {
private static int a;
private int b;

public static void m1() {
	//non static members can't be accessed in static method
	System.out.println(a);
}
public void m2() {
	System.out.println(b);
	System.out.println(a);
	m1();
}
static {
	System.out.println("Hi,dmnfbksdfgnmlfs");
}
public static void main(String[] args) {
	m1();
	//m2();
}

}