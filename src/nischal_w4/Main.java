package nischal_w4;

// Superclass
class Person {
    protected String address;

    public Person(String address) {
        this.address = address;
    }

    public void showAddress() {
        System.out.println("Address: " + address);
    }
}

// Subclass
class Employee extends Person {
    private String department;

    public Employee(String address, String department) {
        super(address); // Call superclass constructor
        this.department = department;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee Address: " + address); // protected access
        System.out.println("Department: " + department);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("123 Main Street", "IT");
        emp.showEmployeeDetails();
        emp.showAddress();
    }
}