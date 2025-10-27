package exceptionhandling;

public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("I am in a main method");
		int result;
		try
		{
			result = TryCatchExample.performDivision(12,0);
			if(result !=0)                                   
				System.out.println("division is" + result);            //Why is this not excetuted because in if statement result is not equal to zero
			System.out.println("----------------------");
			
			result = TryCatchExample.performDivision(12,3);
			if(result !=0)
				System.out.println("division is" + result);           //Why is this not excetuted because once the above exception is excecuted then it wont exceute the below code
			System.out.println("----------------------");
		}
		
		catch(Exception e)
		{
			System.out.println(TryCatchExample.performDivision(12f,15f));      //0.8
			System.out.println("----------------------");
			
			System.out.println(TryCatchExample.performDivision(12f,0f));       //Infinity because it does not throw an exception
			System.out.println("----------------------");
		}

	}

}
