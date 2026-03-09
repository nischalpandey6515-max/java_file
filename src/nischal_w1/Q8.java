package nischal_w1;
import java.util.Scanner;
public class Q8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the  radius");
	double r = sc.nextDouble();
	
	System.out.println("Enter the height");
	double h =sc.nextDouble();
	
	double volume = 3.14*r*r*h;
	System.out.println("The volume of cylinder is :"+volume);
	sc.close();
}
}
