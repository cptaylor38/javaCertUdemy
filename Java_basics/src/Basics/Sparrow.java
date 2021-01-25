package Basics;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String name, String color, boolean domestic) {
        super(name, color, domestic);
    }

    @Override // <-- Not needed.
    public void fly() {
        System.out.println("Flying high");
    }

}
