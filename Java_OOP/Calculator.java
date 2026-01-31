package Java_OOP;

public class Calculator {
	 static int e=2;
	 static int f=4;
	 private int add(int a,int b ) {
		 //int a=2;
		 //int b=4;
        return a + b;
    }
	 private static int minus(int c, int d ) {
		 //int a=2;
		 //int b=4;
        return c - d;
    }
	 private static int multiply() {
        return e * f;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println(calc.add(3,5));
		System.out.println(minus(3,5));
		System.out.println(multiply());
		BankAccount acc = new BankAccount();
		//System.out.println(acc.balance); 
	} 
}