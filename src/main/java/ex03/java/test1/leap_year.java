package ex03.java.test1;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input a");
        int a = sc.nextInt();

        if(a%4==0){
            if(a%100==0){
                if(a%400==0){
                    System.out.println(a+" is leap year");

                }else{
                    System.out.println(a+" is not a leap year");
                }
                return;
            }
            System.out.println(a+" is leap year");
        }else{
            System.out.println(a+" is not a leap year");
        }
    }
}
