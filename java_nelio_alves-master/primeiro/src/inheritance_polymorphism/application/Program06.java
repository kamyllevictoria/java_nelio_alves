package inheritance_polymorphism.application;

import inheritance_polymorphism.entities.Person;
import inheritance_polymorphism.entities.legalPerson;
import inheritance_polymorphism.entities.individualPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();


        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Tax payer #" + i+1 + " data:");
            System.out.println("Individual or company? (i/c)");
            char opc = sc.next().charAt(0);
            if(opc == 'i'){
                System.out.println("Name: ");
                System.out.println();
                String name = sc.next();

                System.out.println("Actual Income: ");
                double income = sc.nextDouble();

                System.out.println("Health Expenditures: ");
                double expenditures = sc.nextDouble();
                list.add(new individualPerson(name,income,expenditures));
            }
            else{
                System.out.println("Name: ");
                System.out.println();
                String name = sc.next();

                System.out.println("Actual Income: ");
                double income = sc.nextDouble();

                System.out.println("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new legalPerson(name, income, employees));
            }
        }
        sc.close();
    }
}
