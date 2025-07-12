package ex06.java.OOPS.Polymorphism;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        System.out.println(addInt(10,20));
        System.out.println(addDouble(20.5,43.7));

    }
    public static int addInt(int a,int b){
        return (a+b);
    }
    public static double addDouble( double a,double b){
        return (a+b);
    }
}
