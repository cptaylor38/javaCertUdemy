public class LearningArrays {
    public static void main(String[] args) {
        int[] values = new int[100];
        values[0] = 1000;
        System.out.println(values[0]);

        double[] decimalValues = new double[100];
        decimalValues[0] = 199.75;
        System.out.println("Populated value: " + decimalValues[0]);
        System.out.println("Unpopulated/Default value: " + decimalValues[1]);

        String[] words = new String[] { "Hello", "World" };
        System.out.println(words[0] + " " + words[1]);

        String[] wordsWithDefinedLength = new String[2];
        wordsWithDefinedLength[0] = "Hello";
        wordsWithDefinedLength[1] = "World";

        // testing for loop for concatenation:
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < wordsWithDefinedLength.length; i++) {
            sentence.append(wordsWithDefinedLength[i] + " ");
        }
        System.out.println(sentence);
        // StringBuilder supposedly more efficient when used with forLoops?
    }
}
