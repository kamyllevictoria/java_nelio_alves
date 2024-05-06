package app;

import java.util.Scanner;

public class bitwiseClass {
    public static void main(String[] args) {
        int num;
        int mask = 0b00100000;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(((num & mask) != 0)){
            System.out.println("6th bit is true!");
        } else{
            System.out.println("6th bit is false!");
        }

        sc.close();
    }
}
