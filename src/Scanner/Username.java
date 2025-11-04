package Scanner;
import java.util.Scanner;

public class Username {

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your address");
		String address=sc.next();
		System.out.println("Enter your phone number");
		long phone=sc.nextLong();
		System.out.println("Enter the gender by typing F or M ");
		char gender=sc.next().charAt(0);
		System.out.println("Hello" +name+ ""+address+ "CONTACT THROUGH"+phone);
		System.out.println("Gender is"+gender);

	}

}
