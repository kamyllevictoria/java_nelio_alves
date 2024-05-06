package app;

import java.util.Locale;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char y;

        System.out.println("Please, type somethings!! :)");
        //z = sc.nextDouble();
        y = sc.next().charAt(0);
        System.out.println("You typed the words: " + y);
        sc.close();
    }
}
