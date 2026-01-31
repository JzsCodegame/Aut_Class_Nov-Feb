package Java_OOP;

public class Operator_practice {
	 //  Instance variables (object-level)
    int a = 10;
    int b = 5;
    boolean isActive = true;
    
    //  Static variable (class-level)
    static int staticCount = 100;
    
//  Instance variables (object-level)
    int instanceCount = 10;
    
 // Final variable (constant)
    final int MAX_LIMIT = 50;
    
    public void demonstrateOperators() {

        // Local variable
        int localCount = 5;

        System.out.println("Initial Values:");
        System.out.println("Instance Count: " + instanceCount);
        System.out.println("Static Count: " + staticCount);
        System.out.println("Local Count: " + localCount);
        System.out.println("Final Limit: " + MAX_LIMIT);
        
        // Increment operators
        instanceCount++;   // post-increment
        ++staticCount;     // pre-increment
        localCount++;      // post-increment

        System.out.println("\nAfter Increment:");
        System.out.println("Instance Count: " + instanceCount);
        System.out.println("Static Count: " + staticCount);
        System.out.println("Local Count: " + localCount);

        // Decrement operators
        instanceCount--;   // post-decrement
        --staticCount;     // pre-decrement
        localCount--;      // post-decrement

        System.out.println("\nAfter Decrement:");
        System.out.println("Instance Count: " + instanceCount);
        System.out.println("Static Count: " + staticCount);
        System.out.println("Local Count: " + localCount);

        // ❌ NOT allowed – final variable cannot be changed
        // MAX_LIMIT++;  // Compile-time error
    }

        
 // Instance method
    public void calculate() {

        // Local variables (method-level)
        int sum;
        int difference;
        boolean result;
        
     // Arithmetic operators
        sum = a + b;              // +
        difference = a - b;       // -
     // Relational operator
        result = a < b;           // >
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("a > b: " + result);
        
     // Logical operator
        boolean finalStatus = isActive != result;  // && , ||, !=
        System.out.println("Final Status: " + finalStatus);
        
     // Assignment operator
        a += 5; // a = a + 5
        System.out.println("Updated a: " + a);
        
     // Unary operator
        ++b;
        System.out.println("Updated b: " + b);

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operator_practice calc1 = new Operator_practice();
		calc1.calculate();
		
		System.out.println(staticCount + calc1.a);
		calc1.demonstrateOperators();
	}

}
