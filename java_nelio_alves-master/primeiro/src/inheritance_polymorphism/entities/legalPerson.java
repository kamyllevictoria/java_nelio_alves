package inheritance_polymorphism.entities;

public class legalPerson extends Person{
    private Integer numberOfEmployess;

    public legalPerson(String name, double annualIncome, Integer numberOfEmployess) {
        super(name, annualIncome);
        this.numberOfEmployess = numberOfEmployess;
    }
    public legalPerson(){
    }
}
