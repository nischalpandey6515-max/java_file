package nischal_w1;
import java.util.Scanner;
public class Q7 {
public static void main(String[] args ) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Celsius temperature:");
	 double C = sc.nextDouble();
	 
    double F = C * 9/5 + 32;
    System.out.print("Celsius in Fahrenheit: "+F);
    sc.close();
}
}
