package Bluescopetasks;

class parent{
	String s = "Parent variable";
	String s1;
	
	parent(){
		System.out.println("Default parent constructor");
	}
	
	parent(String string){
		this.s1 = string;
		System.out.println("Parent parameterzied constructor string : "+s1);
	}
	
	void display() {
		System.out.println("This is parent method");
	}
} 
 
class child extends parent{
	void displaychild() {
		System.out.println("This is child method");
		String str = super.s;                                 //call parent variable
		System.out.println("The string from parent class is "+str);
		super.display();                                     //call parent method
	}
	
	child(){
		super();        //child constructor automatically calls the parent default constructor
	}
	
	child(String s){
		super(s);        // calls the parent parameterized constructor
	}
}

public class Superkey {

	public static void main(String[] args) {
		child o = new child();
		new child("parent constructor");
		o.displaychild();
	}
}
