package nischal_w2;
import java.util.Scanner;
public class Q8 {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your physic mark:");
int ph = sc.nextInt();

System.out.print("Enter your Chemistry  mark:");
int ch = sc.nextInt();

System.out.print("Enter your biology mark:");
int bi = sc.nextInt();

System.out.print("Enter your math mark:");
int ma = sc.nextInt();

System.out.print("Enter your computer mark:");
int co = sc.nextInt();

int total = ph+ch+bi+ma+co;
double percentage = total/5;
System.out.println("The total percentage you score:"+percentage);

if (percentage>=90) {
	System.out.println("A");
}
else if (percentage>=80) {
	System.out.println("B");
}
else if (percentage>=70) {
	System.out.println("C");
}
else if (percentage>=60) {
	System.out.println("D");
}
else if (percentage>=40) {
	System.out.println("E");
}
else {
	System.out.println("F");
}
sc.close();
}
}