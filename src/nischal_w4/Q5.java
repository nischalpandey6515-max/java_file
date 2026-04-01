package nischal_w4;
class Parent {
    private int privateVar = 10;      
    protected int protectedVar = 20;  
    public int publicVar = 30;        

    public int getPrivateVar() {
        return privateVar;
    }
}

// Child class
class Child extends Parent {

    public void accessVariables() {
        
        System.out.println("Private (via getter): " + getPrivateVar());

        System.out.println("Protected: " + protectedVar);

        System.out.println("Public: " + publicVar);
    }
}

// Main class
public class Q5 {
    public static void main(String[] args) {
        Child child = new Child();
        child.accessVariables();
    }
}