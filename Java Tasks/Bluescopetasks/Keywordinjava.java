package Bluescopetasks;

class staticcheck{
	
	static String college = "Anna university";          //static variable
	
	static void display() {
		System.out.println("The college name is "+college);             //static method
	}
	
	static {
		System.out.println("This is static block");       //static block
	}
	
}

public class Keywordinjava {

	public static void main(String[] args) {
		System.out.println("This is main method");
		staticcheck.display();
		staticcheck.college = "Ignou";
		staticcheck.display();
	}

}
