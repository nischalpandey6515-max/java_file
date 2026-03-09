package nischal_w1;
import java.util.Scanner;
public class Q9 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the principal");
	double principal = sc.nextDouble();
	 
	System.out.println("Enter the rate ");
	double rate=sc.nextDouble();
	
	System.out.println("Enter the time");
	double time =sc.nextDouble();
	
	double interest=(principal*rate*time)/100;
	System.out.print("The simple interest"+interest);
	sc.close();
}
}
