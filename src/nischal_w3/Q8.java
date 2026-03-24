package nischal_w3;

public class Q8 {
   
    private String name;
    private int age;

    public Q8() {
        System.out.println("User created!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    public static void main(String[] args) {
       
        Q8 u1 = new Q8();

  
        u1.displayInfo();
    }
}

