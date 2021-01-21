public class ControlFlow {
    public static void main(String[] args) {
        boolean hungry = true;

        if (hungry) {
            System.out.println("Hungry");
        } else {
            System.out.println("Not hungry");
        }

        if (2 == 2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (!(2 < 1)) {
            // !(logic)
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        int favoriteTemp = 75;
        int currentTemp = 60;
        String opinion;

        if (currentTemp < favoriteTemp - 30) {
            opinion = "It's cold";
        } else if (currentTemp < favoriteTemp - 20) {
            opinion = "It's kind of cold";
        } else if (currentTemp < favoriteTemp + 10) {
            opinion = "A little too warm";
        } else {
            opinion = "Just right";
        }

        System.out.println(opinion);
    }
}
