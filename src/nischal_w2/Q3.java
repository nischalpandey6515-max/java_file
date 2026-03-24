package nischal_w2;
import java.util.Scanner;
public class Q3 {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your marks");
int mark = sc.nextInt();
if (mark>90) {
	System.out.print("A+");
}
else if (mark>=80 && mark<=90) {
	System.out.print("A");
	}
else if (mark>=70 && mark<=80) {
	System.out.print("B+");
}
else if (mark>=60 && mark<=70) {
	System.out.print("B");
}
else if (mark>=50 && mark<=60) {
	System.out.print("C+");
	}
else if (mark>=40 && mark<=50) {
	System.out.print("C");
}
sc.close();
}
}
