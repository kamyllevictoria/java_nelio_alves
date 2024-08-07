package error_treatment;

import error_treatment.model_entities.Reservation;
import error_treatment.model_exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int number = sc.nextInt();

            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            if (!checkOut.after(checkIn)) {
                System.out.println("Error in reservation. Check-out must be after check-in date.");
            } else {
                Reservation reservation = new Reservation(number, checkIn, checkOut);
                System.out.println("Reservation: " + reservation);

                System.out.println();
                System.out.println("Enter data to update the reservation: ");
                System.out.println("Check-in date (dd/MM/yyyy): ");
                checkIn = sdf.parse(sc.next());
                System.out.println("Check-out date (dd/MM/yyyy): ");
                checkOut = sdf.parse(sc.next());

                Date now = new Date();
                if (checkIn.before(now) || checkOut.before(now)) {
                    System.out.println("Error in reservation. Reservation dates for update must be future dates.");
                } else if (!checkOut.after(checkIn)) {
                    System.out.println("Error in reservation. Check-out must be after check-in date.");
                } else {
                    reservation.updateDates(checkIn, checkOut);
                    System.out.println("Reservation: " + reservation);
                }
            }
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error.");
        }

        sc.close();
    }
}
