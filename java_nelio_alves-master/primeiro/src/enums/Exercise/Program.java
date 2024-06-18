package enums.Exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate =sdf.parse(sc.next());

        //client
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatusProduct status = OrderStatusProduct.valueOf(sc.next());

        //order
        Order order = new Order(new Date(), status, client);


        System.out.println("How many items to this order? ");
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            System.out.println("Enter #" + i+1 +" data: ");
            System.out.println("Name");
            String product_name = sc.nextLine();
            sc.nextLine();
            System.out.println("Price: ");
            double product_price = sc.nextDouble();
            System.out.println("Quantity: ");
            int product_quantity = sc.nextInt();

            //product
            Product product = new Product(product_name, product_price);

            //item
            OrderItem item = new OrderItem(product_quantity, product_price, product);
            order.addItem(item);
        }
        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
