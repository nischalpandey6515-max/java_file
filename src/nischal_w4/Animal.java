package nischal_w4;

public class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal Constructor Called");
    }

    void displayAnimal() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Dog d = new Dog("tom", 3, "Labrador");
        d.displayDog();
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("Dog Constructor Called");
    }

    void displayDog() {
        displayAnimal();
        System.out.println("Breed: " + breed);
    }
}