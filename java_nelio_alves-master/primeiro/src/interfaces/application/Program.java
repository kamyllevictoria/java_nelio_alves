package interfaces.application;

import interfaces.entities.CarRental;
import interfaces.entities.Vehicle;
import interfaces.services.BrazilTaxServices;
import interfaces.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter with car rental data: ");
        System.out.print("Model: ");
        String carModel = sc.nextLine();
        System.out.print("Withdrawal (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Delivery (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);


        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Hour price: ");
        double pricePerHour = sc.nextDouble();

        System.out.println("Day price: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxServices());
        rentalService.processInvoice(cr);

        System.out.println("INVOICE: ");
        System.out.println("Invoice: " + cr.getInvoice().getBasicPayment());
        System.out.println("Tax: " + cr.getInvoice().getTax());
        System.out.println("Total: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
