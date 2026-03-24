package nischal_w2;
import java.util.Scanner;
public class Q2 {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number");
 int n = sc.nextInt();
 int i=1;
 while(i<=10) {
	 int a = n*i;
	 System.out.println(a);
	 i++;
 }
 sc.close();
}
}
