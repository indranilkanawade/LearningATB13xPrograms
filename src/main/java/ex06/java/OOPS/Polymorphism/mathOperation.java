package ex06.java.OOPS.Polymorphism;

public class mathOperation {

    public static void main(String[] args) {

       // System.out.println(multiply(10,20));
      //  System.out.println(multiply(10,20,5));

        multiply(10,20,5);
        multiply(10,20);

    }

  /*  public static int multiply(int a,int b){
        return (a*b);
    }
    public static int multiply(int a, int b, int c){
        return (a*b*c);
    }*/
    public static void multiply(int a,int b){
        System.out.println(a*b);
    }
    public static void multiply(int a, int b, int c){
        System.out.println(a*b*c);
    }
}
