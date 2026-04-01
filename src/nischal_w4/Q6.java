package nischal_w4;

public class Q6 {

    final class FinalClass {
        void displayMessage() {
            System.out.println("This is a final class.");
        }
    }

    class Parent {
        final void show() {
            System.out.println("This is a final method in Parent class.");
        }
    }

    class Child extends Parent {
      
    }

    // Main method
    public static void main(String[] args) {
        Q6 outer = new Q6(); 

        FinalClass fc = outer.new FinalClass();
        fc.displayMessage();

        Parent p = outer.new Parent();
        p.show();

        Child c = outer.new Child();
        c.show(); 
    }
}
