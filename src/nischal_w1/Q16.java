package nischal_w1;
public class Q16 {
public static void main(String[] args) {
	boolean expr1=(5>3);
	boolean expr2=(8>2);
	boolean expr3=(2>5);
	boolean expr4=(!(5==10));
	//For AND
	boolean AND = expr1 && expr2;
	System.out.println("logical AND"+AND);
	//For OR
	boolean OR = expr1 || expr3;
	System.out.println("logical OR"+OR);
	//For NOT
	boolean NOT = expr4;
	System.out.println("logical NOT"+NOT);

}
}
