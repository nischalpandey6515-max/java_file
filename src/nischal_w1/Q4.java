package nischal_w1;

public class Q4 {
	public static void main (String[] args) {
		double a = 14.2;
		double b = 7.5;
		double c = 11.1;
		double s =(a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.print("the area is :"+area);
		
	}

}
