package constructor_this_encapsulation;

import entities.Product2;

import java.util.Locale;
import java.util.Scanner;

public class program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("\nPrice: ");
        double price = sc.nextDouble();

        Product2 product = new Product2(name, price);

        product.setName("Computer");
        System.out.println("\nUpdated name: " + product.getName());


        product.setPrice(100);
        System.out.println("\nUpdated price: " + product.getPrice());

        System.out.println("Product: " + product);

        System.out.println("\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);
        System.out.println("Updated data: " + product);


        System.out.println("\nEnter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
