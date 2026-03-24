package nischal_w2;

public class Q7 {
public static void main(String[] args) {
	int n = 9;
// for even
if(n %2 ==0 ){
		System.out.println("It is even number");
		if (n %4== 0) {
		System.out.println("It is divisible by 4");
		}
		else {
		System.out.println("It is even but not divisible by 4");
		}
	}
// for odd
else {
		System.out.println("It is odd number");
		if (n % 7 == 0) {
			System.out.println("It is divisible by 7");
		}
		else {
			System.out.println("It is odd but not divisible by 7");
		}
	}
}
}
