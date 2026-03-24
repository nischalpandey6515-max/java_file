package nischal_w2;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }

        sc.close(); 
    }
}
