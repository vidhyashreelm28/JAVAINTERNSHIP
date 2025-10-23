package Polymorphism;

class calculatorlogic
{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,double b)          //same number of arguments with different data types
	{
		return a+b;
	}
	int add(int a,int b,int c)            //different number of arguments to same methods
	{
		return a+b+c;
	}
}
public class Calculator {

	public static void main(String[] args) {
		calculatorlogic calc = new calculatorlogic();
		System.out.println("Add(int,int)->" +calc.add(5,10));
		System.out.println("Double(double,double)->" +calc.add(5.2,10.1));
		System.out.println("Add(int,int,int)->" +calc.add(5,10,5));

	}

}
