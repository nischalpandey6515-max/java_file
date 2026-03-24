package nischal_w3;

public class Q9 {
   
    private double width;
    private double height;
    private double depth;

    public Q9(double length) {
        this.width = length;
        this.height = length;
        this.depth = length;
    }

    public Q9(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Q9() {
        this.width = 10;
        this.height = 8;
        this.depth = 12;
    }

    public void getVolume() {
        double volume = width * height * depth;
        System.out.println("Volume: " + volume);
    }

    public static void main(String[] args) {
      
        Q9 cube = new Q9(5);
        cube.getVolume();

       
        Q9 cuboid = new Q9(4, 6, 8);
        cuboid.getVolume(); // 

       
        Q9 defaultBox = new Q9();
        defaultBox.getVolume();
    }
}

