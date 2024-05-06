package app;

import java.util.Scanner;

public class functionsSintaxeClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int higher = max(num1, num2, num3);

        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if(x > y && y > z){
            aux = x;
        }
        else if(y > z){
            aux = y;

        }
        else{
            aux = z;
        }
        return aux;

    }

    public static void showResult(int value){
        System.out.println("Higher num: " + value);
    }
}
