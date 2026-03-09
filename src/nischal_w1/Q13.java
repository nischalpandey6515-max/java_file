package nischal_w1;
import java.util.Scanner;
public class Q13 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the quantity");
	int quantity= sc.nextInt();
	
	System.out.println("Enter the price");
	int price=sc.nextInt();
	double total=quantity*price;
	System.out.println("The total bill payable is:"+total);
	sc.close();
	}
}
