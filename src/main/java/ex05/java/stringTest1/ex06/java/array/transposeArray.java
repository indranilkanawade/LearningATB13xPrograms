package ex05.java.stringTest1.ex06.java.array;

import java.util.Scanner;

public class transposeArray {

    public static void main(String[] args) {

            transposeArray.transpose();
    }

    public static void transpose(){
        int [][]arr4 = new int[2][3];
        int [][]arr5 = new int[3][2];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[0].length;j++){
                System.out.println("Enter Integer");
                arr4[i][j] = sc.nextInt();
            }
        }
        System.out.println(arr4.length);

        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[0].length;j++){
                System.out.print(arr4[i][j]+" | ");
            }
            System.out.println();
        }
        for(int i=0;i<arr4[0].length;i++){
            for(int j=0;j<arr4.length;j++){
                System.out.print(arr4[j][i]+"|");
            }
            System.out.println();
        }
    }
}
