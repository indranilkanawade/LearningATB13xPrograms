package ex03.java.test1;

import java.util.Scanner;

public class lagest_of_three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter input a");
        int a = sc.nextInt();
        System.out.println("enter input b");
        int b = sc.nextInt();
        System.out.println("enter input c");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("Largest number is: "+a);
        }else if (b>a && b>c){
            System.out.println("Largest number is: "+b);
        }else if (a==b){
            if(a>c){
                System.out.println("Largest number is: "+a);
            }else{
                System.out.println("Largest number is: "+c);
            }
        } else if (b==c) {
            if(b>a){
                System.out.println("Largest number is: "+b);
            }else{
                System.out.println("Largest number is: "+a);
            }
        }else{
            System.out.println("Largest number is: "+c);
        }
    }
}
