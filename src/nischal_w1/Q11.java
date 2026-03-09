package nischal_w1;
import java.util.Scanner;

public class Q11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the  Distance in  miles");
	double miles=sc.nextDouble();
	
	double kilometer=miles*1.60934;
	System.out.println("The conversion into kilometer is:"+kilometer);
	sc.close();
}
}
