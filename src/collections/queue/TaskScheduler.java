package collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TaskScheduler {

	public static void main(String[] args) {
		PriorityQueue<Task> pq = new PriorityQueue<>();
		
		//Add tasks with different priorities
		
		pq.add(new Task("Task 1" , 3));
		pq.add(new Task("Task 1" , 5));
		pq.add(new Task("Task 1" , 2));
		pq.add(new Task("Task 1" , 1));
		pq.add(new Task("Task 1" , 4));
		
		//To traverse the task
		
		Iterator i = pq.iterator();
		while(i.hasNext()) 
		{
			Task t = (Task) i.next();
			System.out.print(t.getName());
			System.out.print(" ");
			System.out.print(t.getPriority());
		}
		
		//How its processed
		
		while(!pq.isEmpty())
		{
			System.out.println("Hi");
			Task t = pq.poll();
			System.out.println("processing Task" + t.getName() + " " + t.getPriority());
		}
		

	}

}
