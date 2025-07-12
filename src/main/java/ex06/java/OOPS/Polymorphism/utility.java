package ex06.java.OOPS.Polymorphism;

public class utility {

    public static void main(String[] args) {
        max(10,20);
        max(30,20,10);
        max(3.14,1.14);

    }

    public static void max(int a,int b){
        int max = a>b?a:b;
        System.out.println("max no is "+max);
    }
    public static void max (int a,int b,int c){
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
        }else if (b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }

    public static void max (double a, double b){
        double max = a>b?a:b;
        System.out.println(max);
    }
}
