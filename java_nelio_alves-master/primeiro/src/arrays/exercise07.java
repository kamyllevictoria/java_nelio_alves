package arrays;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        double media = 0, sum = 0;
        System.out.println("How many elements will there be in the vector?");
        n = sc.nextInt();

        double[] array = new double[n];
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter a number: ");
            array[i] = sc.nextDouble();
            sum += array[i];
            media = sum/ array.length;
        }

        System.out.println("Array average: " + media);
        for(int i = 0; i < array.length; i++){
            if(array[i] < media){
                System.out.println("Elements below average: " + array[i]);
            }
        }

        sc.close();
    }
}
