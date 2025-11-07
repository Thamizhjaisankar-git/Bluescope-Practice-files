package Bluescopetasks;
import firstProject.Inheritance; 
 
public class AccessModifiers extends Inheritance{

	private static double Balance;
	
	public void deposit(double amount) {
		if(amount > 0) {
			Balance += amount;  
		}
	}
	
	private double getbalance() {
		return Balance;
	}
	
	public void withdraw(double amount) {
		if(Balance > amount && amount > 0) {
			Balance -= amount;
			System.out.println("Withdraw successful!");
		}
		else {
			System.out.println("sorry, Insufficient balance!");
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Deposit, withdraw and get the balance"); 
		AccessModifiers o = new AccessModifiers();
		o.deposit(5000.00);
		System.out.println("Balance: "+ o.getbalance());
		o.withdraw(2000.00);
		System.out.println("After withdraw Balance: "+ o.getbalance());
		ExampleMain e = new ExampleMain();
		e.finalstatus();
		o.testing();  
	}

}
