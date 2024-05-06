package objects_introduction;

import java.util.Locale;
import java.util.Scanner;
import entities.Calculator;

public class program06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("\nCircumference: %.2f", c);
        System.out.printf("\nVolume: %.2f", v);
        System.out.printf("\nPI value: %.4f", Calculator.PI);
        sc.close();
    }
}
