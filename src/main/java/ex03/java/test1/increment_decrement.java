package ex03.java.test1;

import java.util.Scanner;

public class increment_decrement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter input a");
        int a = sc.nextInt();
        System.out.println("Original: "+a);
        System.out.println("Pre-increment: "+ ++a);
        System.out.println("Post-increment: "+ a++);
        System.out.println("Pre-decrement: "+ --a);
        System.out.println("Post-decrement: "+ a--);

    }
}
