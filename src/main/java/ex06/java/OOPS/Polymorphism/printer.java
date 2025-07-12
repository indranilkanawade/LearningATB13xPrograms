package ex06.java.OOPS.Polymorphism;

public class printer {
    //printing printData with different parameter type - method overloading
    public static void main(String[] args) {
     // String s = "july";
        printData("July");
        printData(10);
        printData(3.14f);

    }
    //same method name string parameter
    public  static void printData(String s){
        System.out.println(s);
    }
    //same method name int parameter
    public static void printData(int a){
        System.out.println(a);
    }
    //same method name float parameter
    public static void printData(float f){
        System.out.println(f);
    }
}
