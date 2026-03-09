package nischal_w1;
import java.util.Scanner;
public class Q5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System . in);
	 System.out.println("Enter the length");
	 float length = sc.nextFloat();
	 
	System.out.println("Enter the width");
	float width = sc.nextFloat();
	
	float perimeter = 2*(length + width);
	System.out.print("The perimeter is : "+perimeter);
	sc.close();
}
}
