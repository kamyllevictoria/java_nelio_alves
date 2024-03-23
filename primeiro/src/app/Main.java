package app;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int b, a;
        double result;

        a = 5;
        b = 2;

        result = (double )a / b;
        System.out.println(result);

        System.out.print("Hello, world!");
        System.out.println("Nice to meet you!");
        int y = 31;
        double k =  120.239023;
        System.out.printf("%.3f%n", k);
        Locale.setDefault(Locale.US);
    }
}
