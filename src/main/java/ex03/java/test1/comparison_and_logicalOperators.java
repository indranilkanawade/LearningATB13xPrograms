package ex03.java.test1;

import java.util.Scanner;

public class comparison_and_logicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input a");
        int a = sc.nextInt();
        System.out.println("enter input b");
        int b = sc.nextInt();
        boolean equal = a==b;
        boolean greaterThan = a>b;
        boolean lessThan = a<b;
        boolean and = (a>b) && (a>0);
        boolean or = (a<b)||(a>0);
        boolean not = !(a>b);
        System.out.println("a == b: "+equal);
        System.out.println("a > b: "+greaterThan);
        System.out.println("a < b: "+lessThan);
        System.out.println("(a > b) && (a > 0): "+and);
        System.out.println("(a < b) || (a > 0): "+or);
        System.out.println("!(a > b): "+not);
    }
}
