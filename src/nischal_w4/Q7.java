package nischal_w4;

class Calculator {
    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Add three doubles
    double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Add two integers
        int sum1 = calc.add(5, 8);
        System.out.println("Sum of 5 and 8 = " + sum1);

        // Add three integers
        int sum2 = calc.add(10, 15, 20);
        System.out.println("Sum of 10, 15, and 20 = " + sum2);

        // Add two doubles
        double sum3 = calc.add(3.5, 2.7);
        System.out.println("Sum of 3.5 and 2.7 = " + sum3);

        // Add three doubles
        double sum4 = calc.add(1.1, 2.2, 3.3);
        System.out.println("Sum of 1.1, 2.2, and 3.3 = " + sum4);
    }
}
