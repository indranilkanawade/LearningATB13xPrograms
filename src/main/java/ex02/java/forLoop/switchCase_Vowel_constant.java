package ex02.java.forLoop;

import java.util.Scanner;

public class switchCase_Vowel_constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = sc.next().toLowerCase().charAt(0);
        switch (ch){
            case 'a' : System.out.println(ch+"is vowel");
            break;
            case 'e' : System.out.println(ch+"is vowel");
            break;
            case 'i' : System.out.println(ch+"is vowel");
            break;
            case 'o' : System.out.println(ch+"is vowel");
            break;
            case 'u' : System.out.println(ch+"is vowel");
            break;
            default: System.out.println(ch+"is consonent");
        }
    }
}
