package nischal_w1;
import java.util.Scanner;
public class Q15 {
public static void main(String[] args) {
Scanner sc =new Scanner (System.in);

System.out.println("Enter the first number:");
int num1=sc.nextInt();
System.out.println("Enter the second number:");
int num2=sc.nextInt();

int sum=num1+num2;
int difference=num1-num2;
double quotient =num1/num2;

System.out.println("The sum is:"+sum);
System.out.println("The difference is:"+difference);
System.out.println("The quotient is:"+quotient);
sc.close();

}
}