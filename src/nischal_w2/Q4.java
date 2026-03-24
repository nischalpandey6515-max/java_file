package nischal_w2;
import java.util.Scanner;
public class Q4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the age1:");
	int age1 = sc.nextInt();
	System.out.print("Enter the age2:");
	int age2 = sc.nextInt();
	System.out.print("Enter the age3:");
	int age3 = sc.nextInt();
	//for oldest
	if(age1 >age2 && age1>age3 ) {
		System.out.println("YOU ARE OLDER"+age1);
	}
	else if(age2>age3 && age2>age1)  {
		System.out.println("YOU ARE OLDER"+age2);
	}
	else {
		System.out.println("YOU ARE OLDER"+age3);
	}
	
	// for younger
	if(age1 <age2 && age1<age3 ) {
		System.out.println("YOU ARE YOUNGEST"+age1);
	}
	else if(age2<age3 && age2<age1)  {
		System.out.println("YOU ARE YOUNGEST"+age2);
	}
	else {
		System.out.println("YOU ARE YOUNGEST"+age3);
	}

	sc.close();
}
}
