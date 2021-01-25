package Basics;

public class Bird extends Animal {

    public Bird(String name, String color, boolean domestic) {
        super(name, color, domestic);
        // super class'/parent class' constructor
    }

    @Override // <--- Not needed.
    public void move() {
        System.out.println("Flying..");
    }
}
