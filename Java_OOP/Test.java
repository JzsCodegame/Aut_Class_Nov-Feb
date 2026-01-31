package Java_OOP;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "John");
        s1.display();
        new Car();
        Shape s = new Circle();
        s.draw();
        Payment p = new CreditCardPayment();
        p.pay();
        Animal dog = new Dogs(); // parent reference
        dog.sound();           // Dog’s method
	}

}
