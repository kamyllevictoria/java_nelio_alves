package arrays;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        double average = 0;
        double sum = 0;
        System.out.println("How many numbers do you want to digit? ");
        num = sc.nextInt();

        double[] array = new double [num];

        for(int i = 0; i < array.length; i++){
            System.out.println("Enter the " +(i+1) + "° number");
            array[i] = sc.nextDouble();
            sum += array[i];
            average = sum/ array.length;
        }

        System.out.println("Informed values: " );

        for(int i = 0; i < array.length; i++){
            System.out.printf("%.1f, ", array[i]);
        }

        System.out.println("\nSum: " + sum);
        System.out.println("\nAverage: " + average);



        sc.close();
    }
}
