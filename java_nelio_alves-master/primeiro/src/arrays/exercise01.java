package arrays;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int negativeNum = 0;
        int negativeCounter = 0;

        System.out.println("How many numbers do you want to digit? ");
        num = sc.nextInt();

        int[] array = new int [num];
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter the " + (i+1) + "° number: ");
            array[i] = sc.nextInt();
            if(array[i] < 0){
                negativeCounter += 1;
            }
        }
        System.out.println("Negative numbers quantity: " + negativeCounter);

        if(negativeCounter > 0){
            System.out.println("Negative numbers: ");
            for(int i = 0; i <array.length; i++){
                if(array[i] < 0){
                    System.out.println(array[i]);
                }
            }
        }
        else{
            System.out.println("There's any negative num.");
        }

        sc.close();
    }
}
