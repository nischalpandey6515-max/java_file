package nischal_w4;

// Parent class
class Animals {
    String name;

    // Constructor with parameter
    Animals(String name) {
        this.name = name;
        System.out.println("Animals constructor called. Name: " + name);
    }

    void display() {
        System.out.println("Animal name: " + name);
    }
}

// Child class
class Dogs extends Animals {
    String breed;
    
    Dogs(String name, String breed) {
        super(name); 
        this.breed = breed;
        System.out.println("Dogs constructor called. Breed: " + breed);
    }

    void displayDog() {
        super.display();
        System.out.println("Dog breed: " + breed);
    }
}

public class Q3 {
    public static void main(String[] args) {
        // Create Dogs instances
        Dogs d1 = new Dogs("Buddy", "Golden Retriever");
        d1.displayDog();

        System.out.println();

        Dogs d2 = new Dogs("Max", "German Shepherd");
        d2.displayDog();
    }
}
