package arrays;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Enter the length off array: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        System.out.println("Now, enter the values of " +n+ " positions: ");
        for(int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < n; i++){
            sum += vect[i];
        }
        double average = sum/n;

        System.out.println("Average: " + average);
        sc.close();
    }
}
