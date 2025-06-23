package ex03.java.test1;

import java.util.Scanner;

public class arithmatic_and_assignment_operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter input a");
        int a = sc.nextInt();
        System.out.println("enter input b");
        int b = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;
        System.out.println("Addition :"+add);
        System.out.println("Substraction :"+sub);
        System.out.println("Multiplication :"+mul);
        System.out.println("Division :"+div);
        System.out.println("Modulus :"+rem);
    }
}
