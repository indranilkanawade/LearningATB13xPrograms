package ex03.java.test1;

import java.util.Scanner;

public class number_classification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter input a");
        int a = sc.nextInt();

        if(a>0){
            System.out.println(a+" is positive");
        }else if (a<0){
            System.out.println(a+" is negative");
        }else{
            System.out.println(a+" is zero");
        }
    }
}
