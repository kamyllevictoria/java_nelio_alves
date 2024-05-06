package arrays;
import entities.ArrayProduct;

import java.util.Locale;
import java.util.Scanner;

public class program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Enter the vector size: ");

         int n = sc.nextInt();
         ArrayProduct[] vect = new ArrayProduct[n];

        System.out.println("Enter the name and price of the products: ");

         for(int i = 0; i < vect.length; i++){
             sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ArrayProduct(name, price);
         }

         double sum = 0.0;
         for(int i = 0; i < vect.length; i++){
             sum += vect[i].getPrice(); //accessing position and getting their price
         }
        double avg = sum/n;
        System.out.printf("Avarege price: R$%.2f", avg);


        sc.close();
    }
}
