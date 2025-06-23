package ex03.java.test1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input a");
        int N = sc.nextInt();
        int sum=1;
        if(N==0||N==1){
            System.out.println("factorial of "+N+" is "+1);
        }else{
            for(int i=1;i<=N;i++){
                sum = sum*i;
            }
            System.out.println("factorial of "+N+" is "+sum);
        }
    }
}
