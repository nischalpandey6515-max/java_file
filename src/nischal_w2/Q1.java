package nischal_w2;
import java.util.Scanner;
public class Q1 {
public static void  main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length");
	double length = sc.nextDouble();
	
	System.out.println("Enter the breadth");
	double breadth = sc.nextDouble();
	
if(length==breadth) {
	System.out.println("It is square ");
}
	else {
		System.out.println("It is not square");
	}
sc.close();
}
}
