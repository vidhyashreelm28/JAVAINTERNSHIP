package collections.list;

import java.util.ArrayList;
import java.util.List;

import Scanner.School;

public class arrayListdemo {

	public static void main(String[] args) {
		//Static binding
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(new School());
		a1.add(22.22f);
		a1.add("Gayathri");
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		a1.add(1,100);
		System.out.println(a1);
		
		//Dynamic Binding
		List l = new ArrayList();
		l.addAll(a1);
		System.out.println(l);
	
		//By using Generics
		List<Integer> l1= new ArrayList <Integer>();
		l1.add(10);
		l1.add(100);

	}

	

}
