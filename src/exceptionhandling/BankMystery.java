package exceptionhandling;

public class BankMystery {

	public static void main(String[] args) {
		String[] accounts = {"John","Alice",null,"Bob"};
		int[] balances = {1000,2000,3000};
		
		for(int i=0;i<=accounts.length;i++)
		{
			try
			{
				System.out.println("Account holder:" +accounts[i]);
				System.out.println("Balance:" +balances[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Alert! Balance missing " + "for account:" +accounts[i]);
			}
			catch(NullPointerException e)
			{
				System.out.println("Alert! Account name" + "is missing at index:" +i);
			}
		}
		String input = "abc";
		try
		{
		int withdrawal = Integer.parseInt(input);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid input detected:" + "cannot convert '" +input+ "' to number!");
		}
	}

}
