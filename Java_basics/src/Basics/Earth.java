package Basics;

public class Earth {
    public static void main(String[] args) {
        Human human1 = new Human("Tom", 32, 72, "blue");
        Human human2 = new Human("Susan", 78, 54, "brown");
        human1.speak();
        human2.speak();
    }
}
