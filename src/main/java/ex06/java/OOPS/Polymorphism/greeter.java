package ex06.java.OOPS.Polymorphism;

public class greeter {

    public static void main(String[] args) {

        greet();
        greet("Indranil");

    }

    public static void greet(){
        System.out.println("Hello!");
    }
    public static void greet(String name){
        System.out.println("Hello! "+name);
    }
}
