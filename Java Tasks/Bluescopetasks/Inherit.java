package Bluescopetasks;


class person{
	void displayPersondetails(String name, int age) {
		System.out.println("Student name: "+name );
		System.out.println("Student age: "+age );
	}
}

//single inheritance
class student extends person{
	void displayStudentdetails(String dept) {
		System.out.println("Student department: "+dept);
	}
}

//multilevel inheritance
class subjects extends student{
	void displaySubjectdetails(String subjects[]) {
		System.out.print("Student subjects : ");
		for(int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i]+" ");
		}
		System.out.println();
	}
}

//hierarchical Inheritance
class vehicle{
	public void runParent() {
		System.out.println("vehicle is running");
	}
}

class car extends vehicle{
	public void run() { 
		System.out.println("car is running");
	}
}
class Bike extends vehicle{
	public void bike() { 
		System.out.println("Bike is running");
	}
}


public class Inherit {
	
	public static void main(String[] args) {
		subjects s = new subjects(); 
		System.out.println("Printing student details");
		s.displayStudentdetails("CSE");
		s.displayPersondetails("Thamizh", 22);
		String subjects[] = {"Tamil","English","Maths","Science","Social"};
		s.displaySubjectdetails(subjects); 
		car c = new car();
		c.runParent();            //hierarchical inheritance
		c.run();
		Bike b = new Bike();
		b.bike();
		
	}

} 
