package nischal_w5;

abstract class Vehicle {
   
    abstract void wheel();
    void door() {
        System.out.println("Vehicle has doors.");
    }
}

// Bus class extending Vehicle
class Bus extends Vehicle {
    @Override
    void wheel() {
        System.out.println("Bus has 6 wheels.");
    }

    @Override
    void door() {
        System.out.println("Bus has 2 doors.");
    }
}

// Public class for testing
public class BusDemo {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.wheel();
        bus.door();
    }
}
