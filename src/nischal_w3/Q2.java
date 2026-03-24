package nischal_w3;

public class Q2 {
 public static void main(String[] args) {
     
    double[] number = {12.5, 11.2, 13.4, 15.1};
    
    double sum = 0;   // declare before loop
    
    for (int i = 0; i < number.length; i++) {
        sum += number[i];
    }
    
    double avg = sum / number.length;
    
    System.out.println("The sum is " + sum);
    System.out.println("The average is " + avg);
 }
}