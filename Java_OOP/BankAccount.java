package Java_OOP;

public class BankAccount {
	// 1. double – decimal numeric values
    private double balance = 1000.50; //Encapsulation variable

    // 2. int – whole numbers
    private int accountNumber = 123456;

    // 3. long – very large numbers
    private long phoneNumber = 9876543210L;

    // 4. boolean – true / false
    private boolean isActive = true;
    private boolean isReview = false;

    // 5. char – single character
    private char accountType = 'S'; // S = Savings

    // 6. String – text
    private String accountHolderName = "John Doe";

    // 7. float – decimal (less precision than double)
    private float interestRate = 3.5f; 

    // 8. byte – small integer
    private byte branchCode = -128;

    // 9. short – small whole number
    private short pinCode = 13346;
	
    // Method using void return type
    private void showAccountDetails() {
    	        System.out.println("Account Holder: " + accountHolderName);
    	        System.out.println("Account Number: " + accountNumber);
    	        System.out.println("Balance: " + balance);
    	        System.out.println("Interest Rate: " + interestRate);
    	        System.out.println("Account Active: " + isActive);
    	        System.out.println("Account Type: " + accountType);
    	        System.out.println("Branch Code: " + branchCode);
    	        System.out.println("PIN Code: " + pinCode);
    	        System.out.println("Phone Number: " + phoneNumber);
    	    }
	
	

    private void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public void display() {
    	showAccountDetails(); // allowed (same class)
    }
    
    public double getBalance() { //Access Encapsulated Data
        return balance;
    }
    
    public void setBalance(double amount) {
        if (amount > 0) {
            balance = amount;
        }
    }
    public void checkAccountStatus() {

        if (balance >= 500) {
            System.out.println("Account is in good standing.");
        } else {
            System.out.println("Low balance! Please maintain minimum balance.");
        }
    }
    public void accountCategory() {

        if (accountType == 'S') {
            System.out.println("Savings Account");
        } else if (accountType == 'C') {
            System.out.println("Checking Account");
        } else {
            System.out.println("Unknown Account Type");
        }
    }
//    
//    initialization;
//
//    while (condition) {
//        // code to execute
//        increment/decrement;
//    }

    public void validatePin(int enteredPin) {

        int attempts = 1;

        while (attempts <= 3) {

            if (enteredPin == pinCode) {
                System.out.println("PIN verified successfully.");
                return;
            } else {
                System.out.println("Incorrect PIN. Attempt " + attempts);
            }

            attempts++;
        }

        System.out.println("Account locked due to multiple failed attempts.");
    }
//    for (initialization; condition; increment/decrement) {
//        // code to execute
//    }

    public void applyInterestForYears(int years) {

        for (int year = 1; year <= years; year++) {
            balance = balance + (balance * interestRate / 100);
            System.out.println("Year " + year + " Balance: " + balance);
        }
    }
    


    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Balance");
		BankAccount acc = new BankAccount();
        acc.display();
        acc.setBalance(2500.75);     // updates balance
        System.out.println("Updated Balance: " + acc.getBalance());
        acc.checkAccountStatus();
        acc.accountCategory();
        acc.applyInterestForYears(5); 
        
//        for (int i = 1; i <= 10; i++) {
//
//            if (i % 2 == 0) {
//                System.out.println(i + " is Even");
//            } else {
//                System.out.println(i + " is Odd");
//            }
//        }
//        5 % 2 = 1   // remainder of 5 ÷ 2
//        4 % 2 = 0   // remainder of 4 ÷ 2
        
//        int[] numbers = {10, 20, 30, 40, 50, 60};
//
//        for (int i = 0; i <= numbers.length; i++) {
//            System.out.print(numbers[i]);
//           
//        }
        System.out.println("5" + 5);
}
}
