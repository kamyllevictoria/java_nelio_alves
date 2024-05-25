package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class program06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter the size os matrix: ");
        n = sc.nextInt();

        System.out.println("Enter the matrix values:");
        int[][] array = new int[n][n];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.println("Position: [" + i + "]" + "[" + j + "].");
                array[i][j] += sc.nextInt();

            }
        }
        System.out.println("Main diagonal: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i][i] + " ");
        }

        int counter = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j] < 0){
                    counter ++;
                }
            }
        }
        System.out.println("Negative numbers counter: " + counter);

        sc.close();
    }
}
