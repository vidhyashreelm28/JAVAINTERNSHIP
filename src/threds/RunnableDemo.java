package threds;

public class RunnableDemo {

    public static void main(String[] args) {
        UsingRunnable t1 = new UsingRunnable(1, 5, "thread1");
        UsingRunnable t2 = new UsingRunnable(1, 10, "thread2");
//
//        // Use fully qualified java.lang.Thread
//        java.lang.Thread t = new java.lang.Thread(t1);
////        java.lang.Thread tt2 = new java.lang.Thread(t2);
//        
//        t.start();
////        tt2.start();
//
//        try {
//            t.join();
////            tt2.join();
//        } catch (InterruptedException ie) {
//            java.lang.Thread.currentThread().interrupt(); // Restore interrupted status
//            System.err.println("Thread interrupted: " + ie.getMessage());
//        }
//    }


		
		//Using anonymous class
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() { // anonymous class
				System.out.println("Runnable with Anonymous Class");
			}
		};
		
		Thread t = new Thread(runnable);
		t.start();

		
		 //lambda expression
//				runnable = () -> { 
//					System.out.println("Runnable with Lambda Expression");
//				};
//				
//				new java.lang.Thread(runnable).start();


	}
}


