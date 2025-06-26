package ex04.java;

import java.util.Scanner;

public class strings {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String input");
        if(sc.hasNext()){
            String s = sc.next();
            System.out.println(palindromeCheck(s));
        }else{
            System.out.println("Enter String input only");
            return;
        }

    }

    public static String palindromeCheck(String input){
        String s = input;
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        if(rev.equals(s)){
            return "String is palindrome";
        }else{
            return "String is not palindrome";
        }
    }
}
