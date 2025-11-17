package Interface;

@FunctionalInterface
public interface DemoFunctionalInterface {
	
	void m1();
	default void m2(){
		
	}
	
	static void m3() {
		
	}

}