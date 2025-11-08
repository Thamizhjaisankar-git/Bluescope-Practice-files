package Bluescopetasks;

public class Forloop {

	public static void main(String[] args) {
		for(int i = 10; i <= 20; i++) {
			System.out.println("The current number is "+i);
		}
		System.out.println("---------------------------");
		
		
		int i = 0;
		while(i != 7) {
			System.out.println("The number is "+i);
			i++;
		}
		System.out.println("---------------------------");
		
		
		int num = 10;
		do {
			System.out.println("The num is "+num);
			num--;
		}
		while(num > 0);
	}
}


















