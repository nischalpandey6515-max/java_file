package nischal_w5;

// Interface
interface LivingBeing {
    void specialFeature();
}

// Fish class implementing LivingBeing
class Fish implements LivingBeing {
    @Override
    public void specialFeature() {
        System.out.println("Fish can swim in water.");
    }
}

// Bird class implementing LivingBeing
class Bird implements LivingBeing {
    @Override
    public void specialFeature() {
        System.out.println("Birds can fly in the sky.");
    }
}

// Main class
public class LivingBeingDemo {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Bird bird = new Bird();

        fish.specialFeature();
        bird.specialFeature();
    }
}