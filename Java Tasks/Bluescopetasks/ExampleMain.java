package Bluescopetasks;

public class ExampleMain {
	
	public void test() {
		System.out.println("This is non-static test method");
	}
	
	void finalstatus() {
		System.out.println("Thank you, Come again!");
	}

	public static void main(String[] args) {
		System.out.println("This is main method");
		ExampleMain obj = new ExampleMain();
		obj.test();
	}

}




