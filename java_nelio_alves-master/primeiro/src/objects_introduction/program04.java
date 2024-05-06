package objects_introduction;

import java.util.Scanner;
import entities.Employee;

public class program04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter your name: ");
        employee.name = sc.nextLine();

        System.out.println("Enter your salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Enter the tax of your salary: ");
        employee.tax = sc.nextDouble();

        double netSalary = employee.NetSallaray();

        System.out.print("Name: " + employee.name);
        System.out.print("\nGross Salary: $" + employee.grossSalary);
        System.out.print("\nTax: $" + employee.tax);

        System.out.println("\nWhich percentage to increase salary? ");
        employee.percentage = sc.nextDouble();

        double increaseS = employee.IncreaseSalary();

        System.out.println("Updated data: " + employee.name + ", $" + increaseS);
        sc.close();
    }
}
