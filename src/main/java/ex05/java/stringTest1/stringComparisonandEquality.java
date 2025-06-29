package ex05.java.stringTest1;

public class stringComparisonandEquality {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        System.out.println("equals() :"+string1.equals(string2));
        System.out.println("equalsIgonreCase() :"+string2.equalsIgnoreCase(string3));
        System.out.println("compareTo() :"+string3.compareTo(string2));
    }
}
