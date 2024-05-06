package constructor_this_encapsulation;
import entities.Salary;

import java.util.Locale;
import java.util.Scanner;

public class program03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Salary salary_obj;

        System.out.println("***Payroll***");
        System.out.println("Collaborator's name: ");
        String name = sc.nextLine();

        System.out.println("Gross salary value R$: ");
        double salary = sc.nextDouble();

        System.out.println("Hours worked in the month: ");
        double hours = sc.nextDouble();

        salary_obj = new Salary(name, salary, hours);

        if(hours > 160){
           salary_obj.salaryIncreaseTax(salary, hours);
           salary_obj.salaryIncrease(salary, hours);
           System.out.println(salary_obj);

        } else if(hours < 160){
            salary_obj.salaryDiscountTax(salary, hours);
            salary_obj.salaryDiscount(salary, hours);
            System.out.println(salary_obj);
        }
        else{
            System.out.println(salary_obj);
        }

        salary_obj.IRPFCalc();
        salary_obj.INSSCalc();
        salary_obj.liquidSalaryCalc();
        sc.close();
    }
}
