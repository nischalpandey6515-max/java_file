package nischal_w1;
import java.util.Scanner;
public class Q10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number ");
	int num1=sc.nextInt();
	
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	
	int add = num1+num2;
	int sub= num1-num2;
	int mul = num1*num2;
	double div = num1/num2;
	System.out.println("Addition"+add);
	System.out.println("Subtraction"+sub);
	System.out.println("Multiplaction"+mul);
	System.out.println("Division"+div);
	sc.close();
}
}
