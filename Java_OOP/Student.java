package Java_OOP;

public class Student {
	int id;
    String name;
    
    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println(id + " " + name);
    }
}

