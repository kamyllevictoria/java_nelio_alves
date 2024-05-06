package objects_introduction;
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class program02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("\nPrice: ");
        product.price = sc.nextDouble();

        System.out.print("\nQuantity: ");
        product.quantity = sc.nextInt();

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
