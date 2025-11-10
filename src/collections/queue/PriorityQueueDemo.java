package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) 
	{
		Queue <String> pq= new PriorityQueue<String>();
		
		pq.add("Core java");
		pq.add("Angular");
		pq.add("React");   // while insertion it is not giving priority based on the alphabet order
		pq.add("Html");
		
		System.out.println(pq);
		
		pq.remove();       //but in here it follows in here
		System.out.println(pq);
	}

}
