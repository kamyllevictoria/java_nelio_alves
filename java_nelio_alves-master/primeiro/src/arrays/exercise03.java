package arrays;

import java.util.Locale;
import java.util.Scanner;

public class exercise03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double average, heigthTotal = 0, averageHeigth = 0, minorCounter = 0, totalMinor = 0;

        System.out.print("How many persons will be informed? ");
        n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] heigth = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson n° " + i+1);

            System.out.print("Name: ");
            name[i] = sc.next();

            System.out.print("Idade: ");
            age[i] = sc.nextInt();

            System.out.print("Altura: ");
            heigth[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++){
            heigthTotal += heigth[i];
            averageHeigth = heigthTotal/n;
        }

        for(int i  = 0; i < n; i++){
            if(age[i] < 16){
                minorCounter ++;
            }
        }

        totalMinor = (minorCounter/n)*100;

        System.out.println("Heigth Average: " + averageHeigth + "m.");
        System.out.println("People under 16 years: " +totalMinor + "%.");
        for(int i = 0 ; i < n; i++){
            if(age[i] < 16){
                System.out.printf("%s", name[i]);
            }
        }

        sc.close();
    }
}