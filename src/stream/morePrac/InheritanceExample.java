package stream.morePrac;

class Parent {
	protected void display() {
        System.out.println("parent display() method"); // Corrected the println statement
    }
}

class Child extends Parent {
	protected void display() {
        System.out.println("child display() method"); // Corrected the println statement
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display(); // Output: parent display() method

        Parent p1 = new Child();
        p1.display(); // Output: child display() method

        // The following line will result in a compilation error:
       // Child c1 = new Parent();
        //You cannot assign a Parent object to a Child reference.

        Child c2 = new Child();
        c2.display(); // Output: child display() method
    }
}
