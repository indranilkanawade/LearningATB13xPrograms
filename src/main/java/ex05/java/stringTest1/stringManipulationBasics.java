package ex05.java.stringTest1;

import java.util.Scanner;

public class stringManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        System.out.println("Length: "+s.length());
        System.out.println("First Char: "+s.charAt(0));
        System.out.println("Substring: "+s.substring(6,s.length()));

    }
}
