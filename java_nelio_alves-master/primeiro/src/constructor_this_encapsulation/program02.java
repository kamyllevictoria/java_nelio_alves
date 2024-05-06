package constructor_this_encapsulation;
import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there an inital deposit? (y/n)");
        char response = sc.next().toLowerCase().charAt(0);
        if(response == 'y'){
            System.out.println("Enter initial deposit value");
            double initialDeposit = sc.nextDouble();
            account = new Account (holder, number, initialDeposit);
        }
        else{
            account= new Account(holder, number);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.println("Enter a deposit value:");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(account);


        System.out.println("Enter a whithdraw value (tax $5.00): ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("\nAccount data:");
        System.out.println(account);




        sc.close();
    }
}


