package Basics;

public class Human {
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    // constructor methods should always have the same name as their class.
    public Human(String name, int age, int heightInInches, String eyeColor) {
        super();
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old.");
        System.out.println("I am " + heightInInches + " inches tall.");
        System.out.println("My eyes are " + eyeColor);
    }

    public void eat() {
        System.out.println("Nom nom nom");
    }

    public void sleep() {
        System.out.println("ZzzzzzZZzzz...");
    }
}
