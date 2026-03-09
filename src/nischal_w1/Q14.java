package nischal_w1;
import java.util.Scanner;
public class Q14 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the amount in USD");
	double usd =sc.nextDouble();
	System.out.println("Enter the exchange rate :");
	double rate = sc.nextDouble();
	double amount = usd*rate;
	System.out.println("The  total amount after convert is :"+amount);
	sc.close();
		
			}
}
