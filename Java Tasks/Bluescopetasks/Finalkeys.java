 package Bluescopetasks;

 final class test{
	 
	 final String var = "hello"; 

 }
 
 class test2{

	 final void display() {
		 System.out.println("This is final method");
	 }
 }
 
// class child1 extends test{             //can't be inherit
//	 void display() {
//		 System.out.println("This is child method");
//	 }
// }
  
// class child2 extends test2{             //can't be override
//	 void display() {
//		 System.out.println("This is child method");
//	 }
// }
 
 
public class Finalkeys {

	public static void main(String[] args) {
		System.out.println("This is main method");
		test t = new test(); 
//		t.var = "hi";                      //can't be reassign 
	}

}

 