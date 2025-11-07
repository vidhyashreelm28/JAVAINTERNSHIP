package collections.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();  // Creating LinkedList object
        l.add(10);
        l.add(20);
        l.add(30);
        l.add("Hi");
        
        System.out.println(l);  // Printing all elements
        
        l.removeFirst();  // Removes the first element (10)
        
        // Using ListIterator to iterate elements
        ListIterator li = l.listIterator();
        while(li.hasNext()) {
            System.out.println(li.next());
        }
        
        l.addLast(22.2f);  // Adds element at the end
        System.out.println(l);
    }
}
