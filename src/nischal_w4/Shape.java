package nischal_w4;

public class Shape {

    double getPerimeter() {
        return 0;
    }

    double getArea() {
        return 0;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println("Perimeter of Circle: " + c.getPerimeter());
        System.out.println("Area of Circle: " + c.getArea());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}