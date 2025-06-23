package ex03.java.test1;

import java.util.Scanner;

public class print_numbers_using_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input a");
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            System.out.print(i+" ");
        }
    }
}
