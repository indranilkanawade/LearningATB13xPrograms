package ex02.java.forLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class countVowels_Constants {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String input");
        String name = sc.next();
        char[] vowels = {'a','e','i','o','u'};
        char[] name1 = name.toCharArray();
        int vowel=0;
        for(int i =0; i<vowels.length;i++){
            for(int j=0; j<name1.length;j++){
                if(vowels[i]==name1[j]){
                    vowel++;
                }
            }
        }
        int constant=name1.length-vowel;
        System.out.println("vowels ->"+vowel);
        System.out.println("constant ->"+constant);
    }
}
