package Basics;

public abstract class Animal {
    // You cannot create an instance of an abstract class.

    String name;
    String color;
    boolean domestic;

    protected Animal(String name, String color, boolean domestic) {
        this.name = name;
        this.color = color;
        this.domestic = domestic;
    }

    public void description() {
        System.out.println("This animal is a " + name);
        System.out.println("They are " + color);
        if (!this.domestic) {
            System.out.println("They are not domestic.");
        } else {
            System.out.println("They are domestic.");
        }
    }

    public abstract void move();
    // Abstract method must be executed by child.
}
