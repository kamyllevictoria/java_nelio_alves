package error_treatment;

import error_treatment.model_entities.Reservation;
<<<<<<< HEAD
import error_treatment.model_exceptions.DomainException;
=======
<<<<<<< HEAD
import error_treatment.model_exceptions.DomainException;
=======
>>>>>>> 559f346fd1cc2b317827fa176462f3fb5257e6f3
>>>>>>> 9cfe63e718868f60511485f95a7ffbeba1c2b84f

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class program03 {
<<<<<<< HEAD
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
=======
<<<<<<< HEAD
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.println("Room number: ");
            int number = sc.nextInt();

            System.out.println("Check-in data (dd/mm/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.println("Check-out data (dd/mm/yyyy): ");
            Date checkOut = sdf.parse(sc.next());


=======
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();

        System.out.println("Check-in data (dd/mm/yyyy): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.println("Check-out data (dd/mm/yyyy): ");
        Date checkOut = sdf.parse(sc.next());


        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation. Check-out must be after check-in date.");
        }
        else{
>>>>>>> 559f346fd1cc2b317827fa176462f3fb5257e6f3
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
<<<<<<< HEAD
=======

>>>>>>> 559f346fd1cc2b317827fa176462f3fb5257e6f3
            System.out.println("Check-in data (dd/mm/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out data (dd/mm/yyyy): ");
            checkOut = sdf.parse(sc.next());

<<<<<<< HEAD
            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch(ParseException e){
            System.out.println("Invalid date format.");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected error.");
        }

=======
            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Error in reservation. Reservation dates for update must be future dates.");
            }
            else if(!checkOut.after(checkIn)){
>>>>>>> 9cfe63e718868f60511485f95a7ffbeba1c2b84f
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
<<<<<<< HEAD
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error.");
        }

=======
            else{
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation:\n " + reservation);
            }

        }


>>>>>>> 559f346fd1cc2b317827fa176462f3fb5257e6f3
>>>>>>> 9cfe63e718868f60511485f95a7ffbeba1c2b84f
        sc.close();
    }
}
