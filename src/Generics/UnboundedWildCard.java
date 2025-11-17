package Generics;

import java.util.List;

public class UnboundedWildCard {
	public static void display(List<?> l)
	{
		for(Object o : l)
		{
			System.out.println(o);
		}
	}

}
