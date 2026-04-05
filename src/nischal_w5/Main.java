package nischal_w5;

// Abstract class Shape
abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Quadrilateral extends Shape {
    private double length;
    private double breadth;

    public Quadrilateral(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Quadrilateral: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Quadrilateral: " + perimeter);
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Quadrilateral q = new Quadrilateral(10, 5);
        q.calculateArea();
        q.calculatePerimeter();
    }
}
