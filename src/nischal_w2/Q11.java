package nischal_w2;
import java.util.Scanner;
public class Q11 {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        long fact = 1;

	        for (int i = 1; i <= n; i++) {
	            fact = fact * i;
	        }

	        System.out.println("Factorial = " + fact);
	        sc.close();
	    }
	}

