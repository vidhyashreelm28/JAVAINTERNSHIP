package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		String days[] = new String[7];   //Declaration
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<days.length;i++)
        {
        	System.out.println("Please enter the "+i+"th "+"day");
        	days[i]=sc.nextLine();
        }
        System.out.println("Days of the week are");
        for(int i=0;i<days.length;i++)
        {
        	System.out.println(days[i]);
        }	
        int arr[] = {100,20,30,420,50};
        Arrays.sort(arr);  ///arrays in java is class //what if we comment this line and u need to sort the elements
        // For wat follow below code
        /*  
         *for(int i=0;i<arr1.length-1;i++) {
			for(int k=i+1;k<arr1.length;k++) {
				if(arr1[i]>arr1[k]) {
					int temp=arr1[k];
					arr1[k]=arr1[i];
					arr1[i]=temp;
				}
			}
		}
		 */
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr);
	    }
	}
}
