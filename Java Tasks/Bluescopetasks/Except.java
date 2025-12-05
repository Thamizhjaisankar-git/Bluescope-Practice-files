package Bluescopetasks;
import java.io.*; 

public class Except {

	public static void file() throws IOException{ 
		FileReader f = new FileReader("myFile");
	}
	
	public static void main(String[] args) {
		try { 
			file();
		}
		catch(IOException e) {
			System.out.println(e.getMessage()); 
		}
		finally { 
			System.out.println("Final block");
		} 

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	public static void age(int a) { 
//		if(a < 18)
//			throw new ArithmeticException("age less than 18 is not accepted"); 
//		else{
//			System.out.println("You are eligible");
//		}
//	}
//
//	public static void main(String[] args) {
//		
//		//throw
//		try { 
//			age(10);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage()); 
//		}
//		finally {
//			System.out.println("Final block");
//		} 
//		
		
		
		//unchecked
//		try {
//			int a = 10/0;
//		}
//		catch(ArithmeticException e) { 
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("Final block");
//		} 
		
		
		
		//checked 
//		try {
//			FileReader f = new FileReader("myFile");
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//		finally {
//			System.out.println("Final block");
//		} 
//	}
//
//}










//throws
//package firstProject;
//import java.io.*;
//
//public class Exception {
//	
//	public static void file() throws IOException{ 
//			FileReader f = new FileReader("myFile");
//	}
//
//	public static void main(String[] args) {
//		try { 
//			file();
//		}
//		catch(IOException e) {
//			System.out.println(e.getMessage()); 
//		}
//		finally { 
//			System.out.println("Final block");
//		} 
//	}
//
//}


