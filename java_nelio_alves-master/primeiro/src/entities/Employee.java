package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double percentage;

    public double NetSallaray(){
        return (grossSalary - tax);
    }

    public double IncreaseSalary(){
        return ((grossSalary - tax) + ( (percentage/100)* grossSalary));
    }

}
