package array;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        int []arr = new int[5];
        int [] arr1 = {1,5,6,7};
        int [][] arr2 = new int[3][3];
     /*   int [][]arr3 = {{1,2,4},{5,6,7},{8,9,10}};

        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[0].length;j++){
                System.out.print(arr3[i][j]+"|");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transpose of matrix is");
        for(int i=0;i<arr3[0].length;i++){
            for(int j=0;j<arr3[0].length;j++){
                System.out.print(arr3[j][i]+"|");
            }
            System.out.println();
        }*/
        array.transpose();
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
        for(int i=0;i<arr4[0].length;i++){
            for(int j=0;j<arr4.length;j++){
                System.out.print(arr4[j][i]+"|");
            }
            System.out.println();
        }
    }


}
