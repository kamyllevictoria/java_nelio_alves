package inheritance_polymorphism.application;

import inheritance_polymorphism.entities.ImportedProduct;
import inheritance_polymorphism.entities.Product;
import inheritance_polymorphism.entities.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.println("Common, used or imported? (c/u/i)");
            char ch = sc.next().charAt(0);

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i') {
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else if (ch == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY):");
                sc.nextLine();
                LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, manufactureDate));
            } else {
                list.add(new Product(name, price));
            }
        }

            System.out.println("Product tags: ");
            for (Product prod : list) {
                System.out.println(prod.priceTag());
            }
            sc.close();
    }
}
