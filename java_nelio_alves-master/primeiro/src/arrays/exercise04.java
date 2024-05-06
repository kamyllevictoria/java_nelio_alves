package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n, counter = 0;

        System.out.println("How many numbers do you want to digit? ");
        n = sc.nextInt();

        double[] numbers = new double [n];

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a number: ");
            numbers[i] = sc.nextDouble();
        }
        System.out.println("Pair numbers: ");
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                System.out.print(numbers[i] + ", ");
            }
        }


        sc.close();
    }
}
