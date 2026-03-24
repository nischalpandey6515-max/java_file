package nischal_w2;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have medical cause ('y' or 'n'):");
        char ch = sc.next().charAt(0);

        if (ch == 'y' || ch == 'Y') {
            System.out.println("You are allowed");
        } else if (ch == 'n' || ch == 'N') {
            System.out.println("You are not allowed");
        } else {
            System.out.println("Please enter y or n");
        }

        sc.close();
    }
}
