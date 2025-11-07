package Bluescopetasks;


	interface Vehicle{
		void run();
	}
	
	interface Engine{
		void core();
	}
	
	class Car implements Vehicle, Engine{
		public void run() {
			System.out.println("Vehicle Interface method is running");
		}
		
		public void core() {
			System.out.println("Engine Interface method is running");	
		}
		
	
	}



public class CombineClassInterObj {

	
	public static void main(String[] args) {
		System.out.println("Combination of Interface, class and object");
		Car c = new Car();
		c.run();
		c.core();
	}

}
