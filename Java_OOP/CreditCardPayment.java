package Java_OOP;

public class CreditCardPayment implements Payment,AccountOperations  {
	private double balance = 1000;

    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        balance -= amount;
    }
	
	public void pay() {
        System.out.println("Paid using Credit Card");
    }
	
}
