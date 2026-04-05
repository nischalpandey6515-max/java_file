package nischal_w5;

// Animal interface
interface Animal {
    void eat();
    void walk();
}

// Printable interface
interface Printable {
    void display();
}

// Cow class implementing both interfaces
class Cow implements Animal, Printable {
   
    public void eat() {
        System.out.println("Cow eats grass.");
    }

    public void walk() {
        System.out.println("Cow walks slowly.");
    }

    public void display() {
        System.out.println("This is a Cow.");
    }
}

// Public class for testing
public class CowDemo {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
        cow.walk();
        cow.display();
    }
}
