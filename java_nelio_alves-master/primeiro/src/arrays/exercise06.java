package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;

        System.out.println("How many positions will vectores A and B have?");
        n = sc.nextInt();
        double[]A = new double[n];
        double[]B = new double[n];

        System.out.println("Enter the A vector values: ");
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextDouble();
        }

        System.out.println("Enter the B vector values: ");
        for(int i = 0; i < B.length; i++){
            B[i] = sc.nextDouble();
        }

        double[]C = new double[n];
        for(int i = 0; i< A.length; i++){
            for(int j = 0; j < B.length; j++){
                C[i] = A[i] + B[i];
            }
        }
        System.out.println(Arrays.toString(C));




        sc.close();
    }
}
