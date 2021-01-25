package Basics;

public class Zoo {
    public static void main(String[] args) {
        Bird parrot = new Bird("Parrot", "All kinds of colors", true);
        Animal sparrow1 = new Sparrow("Sparrow", "Not sure", false);
        // Animal is the type for the sparrow1 variable, but the object created is of
        // type Sparrow.
        // Methods we can invoke on variables are based on the type specification.
        // I.e.
        sparrow1.move(); // Can call abstract move() method of Animal class but cannot access
        // Sparrow's fly() method.
        Sparrow sparrow2 = new Sparrow("Sparrow", "Not sure", false);
        sparrow2.fly();
        parrot.description();

        moveAnimal(sparrow1);

        // Flyable (the interface) is actually a type.
        Flyable flyingBird = new Sparrow("Sparrow", "Don't know", false);
        // Only has access to fly() method because it's of type flyable.
        flyingBird.fly();
        // Flyable flyingBird2 = new Bird("Sparrow", "Don't know", false);
        // Type mismatch because Bird class does not implement Flyable interface, only
        // Sparrow does.
    }

    public static void moveAnimal(Animal animal) {
        // implemented as an example of polymorphism
        // representing the general idea of an animal being able to move
        // with the paramater being a parent type meaning that all children can...
        // passed in through the same method
        animal.move();
    }
}
