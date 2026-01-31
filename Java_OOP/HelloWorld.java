package Java_OOP;

public class HelloWorld extends Vehicle {
//	public void pay() {
//        System.out.println("Paid using Credit Card");
//    }
	void draw() {
        System.out.println("Drawing Circle");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Payment p = new CreditCardPayment();
        p.pay();

	}

}
