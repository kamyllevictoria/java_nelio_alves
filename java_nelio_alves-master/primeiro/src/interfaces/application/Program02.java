package interfaces.application;

import interfaces.services.InstallmentCalc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;


public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        Calendar c = Calendar.getInstance();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter with contract's data: ");

        System.out.println("Number: ");
        int contractNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Data: ");
        LocalDate contractData = LocalDate.parse(sc.nextLine(), fmt);

        System.out.println("Contract value: ");
        double contractValue = sc.nextDouble();
        sc.nextLine();

        System.out.println("Value of installments: ");
        int valueInstallments = sc.nextInt();

        int month = contractData.getMonthValue();

        System.out.println("Parcelas: ");
        InstallmentCalc ic = new InstallmentCalc();
        ic.dueDate(valueInstallments, contractData, contractValue,valueInstallments);

        sc.close();

    }
}
