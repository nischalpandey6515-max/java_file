package nischal_w5;

public class Demo2 {
    public static void main(String[] args) {
       
        int[] age = {10, 20, 25, 24, 28, 27, 30, 31, 32};

        try {
            System.out.println(age[9]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Array length is " + age.length);
        }
    }
}
