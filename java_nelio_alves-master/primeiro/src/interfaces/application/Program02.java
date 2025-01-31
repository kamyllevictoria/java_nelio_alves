package interfaces.application;

import interfaces.entities.Contract;
import interfaces.entities.Installment;
import interfaces.services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;


public class Program02 {
    public static <Installment> void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

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
        Contract obj = new Contract(contractNumber, contractData, contractValue);

        System.out.println("Value of installments: ");
        int m = sc.nextInt();


        ContractService contractService = new ContractService(null);
        contractService.processContract(obj, m);

        System.out.println("Parcelas: ");
        for(interfaces.entities.Installment installment : obj.getInstalments()){
            System.out.println(installment);
        }




        sc.close();

    }
}
