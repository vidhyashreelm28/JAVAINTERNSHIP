package Polymorphism;

//parent class
class payment{
	void makepayment()
	{
		System.out.println("Processing payment using generic payment");
	}
}
class Upipayment extends payment
{
	void makepayment()
	{
		System.out.println("Processing payment using UPI");
	}
	
}
class Cardpayment extends payment
{
	void makepayment()
	{
		System.out.println("Processing payment using Credit/debit card");
	}
	
}

//Every class is having same method 
public class Methodoveriding {

	public static void main(String[] args) {
		payment pay;
		pay=new Upipayment();
		pay.makepayment();
		
		pay=new Cardpayment();
		pay.makepayment();
	}

}
