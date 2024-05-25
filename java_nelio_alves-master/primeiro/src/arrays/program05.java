package arrays;
import entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee2> list = new ArrayList<>();
        int n;

        System.out.println("How many employees will be registered?");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" +(i+1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee2 emp = new Employee2(id, name, salary);
            list.add(emp);
        }

        System.out.print("Enter the employee ID that will have salary increase: ");
        int idSalary = sc.nextInt();

        Integer pos = position(list, idSalary);
        if(pos == null){
            System.out.println("ID not found.");
        }
        else{
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println("List of employess: ");
        for(Employee2 emp: list){
            System.out.println(emp);
        }


        sc.close();
    }
    public static Integer position(List<Employee2> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getID()== id){
                return i;
            }
        }
        return null;
    }

}
