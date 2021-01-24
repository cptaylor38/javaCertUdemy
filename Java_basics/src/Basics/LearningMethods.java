package Basics;

public class LearningMethods {

    // *Notes on Method Signatures
    // Void method has no return value.
    // public/private - Access Modifier
    // private - Used locally within the class it's contained in.
    // static - Allows the method to be accessable by its containing class.
    // Removing static makes the method only accessible by an instance of the class.
    // Example:
    // ClassName [newVariable] = new ClassName();
    // newVariable.nonStaticMethod();

    // [Access Modifier] [] [Return Type] [Method Name/Declration] ([value
    // type(s)][argument(s)])

    public static void main(String[] args) {
        MyUtils.printText("Some data");
        System.out.println(MyUtils.add10(MyUtils.sum(2, 8)));
    }

}
