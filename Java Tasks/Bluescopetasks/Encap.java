package Bluescopetasks;
import java.util.*;

public class Encap {

	private String name;
	private String password;
	private String result;
	
	Encap(){                                                        //default constructor
		System.out.println("Checking the Login credentials!");
	}
	
	Encap(String n, String pass){                                   //parameterized constructor
		this.name = n;
		this.password = pass;
	}
	
	
	public String checkpass(String n, String pass){ 
		if(n.equals(name) && pass.equals(password)) {
			result = "Login Success!";
		}
		
		else { 
			result = "Login failed!";
		}
		return result; 
		
	}
	
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name: "); 
		String n = s.nextLine();
		System.out.println("Enter your password: ");
		String pass = s.nextLine();
		s.close();
		Encap o = new Encap();                               //object for c
		Encap o1 = new Encap("Thamizh","Pass_word");         //object for parameterized constructor
		System.out.println(o1.checkpass(n, pass));	
	}

}
