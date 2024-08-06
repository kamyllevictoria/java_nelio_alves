package inheritance_polymorphism.entities;
public class physicalPerson extends Person{
    private double healthSpending;

    public physicalPerson(String name, double annualIncome, double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }
    public physicalPerson() {
    }

}
