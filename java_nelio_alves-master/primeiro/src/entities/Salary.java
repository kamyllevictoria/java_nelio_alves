package entities;

public class Salary {
    public String name;
    public double salary;
    public double hours;
    public double increaseTax;
    public double discountTax;
    public double increase;
    public double discount;
    public double inssTax;
    public double irpfTax;
    public double liquidSalaryIncrease;
    public double liquidSalaryDiscount;


    public Salary(String name, double salary, double hours ) {
        this.name = name;
        this.salary = salary;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void salaryIncreaseTax(double salary, double hours ){
        this.increaseTax = ((salary * hours) / 160) - salary;
    }

    public void salaryIncrease(double salary, double hours ){
        this.increase = ((salary * hours) / 160);
    }

    public void salaryDiscountTax(double salary, double hours ){
        this.discountTax = ((salary * hours) / 160) - salary;
    }
    public void salaryDiscount(double salary, double hours ){
        this.discount = ((salary * hours) / 160);
    }


    public void INSSCalc(){
        if(salary <= 1412.00){
            inssTax = (1412.00 * 0.075);
            System.out.println("\nINSS Tax: " + inssTax);
        }
        else if(salary >= 1412.01 && salary <= 2666.68){
            inssTax = (1412.01 * 0.075) + ((salary - 1412.01)* 0.09);
            System.out.println("\nINSS Tax: " + inssTax);
        }
        else if(salary >= 2666.69 && salary <= 4000.03){
            inssTax = (1412.00 * 0.075) + ((2666.68 - 1412.00) * 0.09) + ((salary - 2666.68) * 0.12);
            System.out.println("\nINSS Tax: " + inssTax);
        }
        else if(salary > 4000.04 && salary <= 7768.02){
            inssTax = (1412.00 * 0.075) + ((2666.68 - 1412.00) * 0.09) + ((4000.03 - 2666.68) * 0.12) + ((salary - 4000.03) * 0.14);
            System.out.println("\nINSS Tax: " + inssTax);
        }
        else if(salary > 7768.02){
            inssTax = (1412.00 * 0.075) + ((2666.68 - 1412.00) * 0.09) + ((4000.03 - 2666.68) * 0.12) + ((7786.02 - 4000.03) * 0.14);
            System.out.println("\nINSS Tax: " + inssTax);
        }
    }

    public void IRPFCalc(){
        if(salary >= 2259.21 && salary <= 2826.65){
            irpfTax = (salary * 0.075) - 169.44;
            System.out.printf("IRPF Tax: %.2f", irpfTax);
        }
        else if(salary >= 2826.66 && salary <= 3751.05){
            irpfTax = (salary * 0.15) - 381.44;
            System.out.printf("IRPF Tax: %.2f", irpfTax);
        }
        else if(salary >= 3751.06 && salary <= 4664.68){
            irpfTax = (salary * 0.225) - 662.77;
            System.out.printf("IRPF Tax: %.2f", irpfTax);
        }
        else if(salary > 4664.68){
            irpfTax = (salary * 0.275) - 896;
            System.out.printf("IRPF Tax: %.2f", irpfTax);
        }
        else{
            irpfTax = 0;
            System.out.printf("IRPF Tax: %.2f", irpfTax);
        }
    }

    public void liquidSalaryCalc(){
        if(hours > 160){
            liquidSalaryIncrease = increase - irpfTax - inssTax;
            System.out.printf("Liquid Salary: R$ %.2f", liquidSalaryIncrease);
        } else if(hours < 160){
            liquidSalaryDiscount = discount - irpfTax - inssTax;
            System.out.printf("Liquid Salary: R$ %.2f", liquidSalaryDiscount);
        } else{
            System.out.println(salary - irpfTax - inssTax);
        }

    }

    public String toString(){
        if(increaseTax != 0){
            return "Name: " + name + "\nGross salary R$ " + salary + "\nIncrease: R$ " + increaseTax + "\nSalary with increase tax: " + increase;
        } else if(discountTax != 0){
            return "Name: " + name + "\nGross salary R$ " + salary + "\nDiscount: R$ " + discountTax + "\nSalary with discount tax: " + discount;
        } else {
            return "Name: " + name + "\nGross salary R$ " + salary;
        }
    }

}


