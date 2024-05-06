package app;

import java.sql.SQLOutput;
import java.util.Scanner;

public class loopClass {
    public static void main(String[] args) {
        double num;
        System.out.println("Informe um numero e veja sua tabuada: ");

        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();
        for(int i = 0; i <= 10; i++){
            double result = num * i;
            System.out.printf("%.2f x %d= %.2f\n", num, i, result);
        }

        sc.close();

    }
}
