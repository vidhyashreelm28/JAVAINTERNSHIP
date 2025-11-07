package collections.list;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args)
    {
        Vector v = new Vector();  // Creating Vector object
        v.add(100);
        v.add(80);
        v.add(90);
        v.add("Hello");
        
       // Printing all elements
        System.out.println(v);  
        
       // Accessing element at index 1
        System.out.println("Element at index 1: " + v.get(1));
        
       // Removes the first element (index 0)
        v.remove(0);  
        
        // Using ListIterator to iterate elements
        ListIterator li = v.listIterator();
        while(li.hasNext()) {
            System.out.println(li.next());
        }
        
        // Adds element at the end
        v.add(11.1f);  // Adds element at the end
        System.out.println(v);
    }
}
