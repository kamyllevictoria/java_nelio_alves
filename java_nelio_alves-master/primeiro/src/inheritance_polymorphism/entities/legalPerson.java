package inheritance_polymorphism.entities;

public class legalPerson extends Person{
    private Integer numberOfEmployess;


    public legalPerson(String name, Double annualIncome, Integer numberOfEmployess){
        super(name, annualIncome);
        this.numberOfEmployess = numberOfEmployess;
    }
    public legalPerson(){
    }

    public Integer getNumberOfEmployess() {
        return numberOfEmployess;
    }

    public void setNumberOfEmployess(Integer numberOfEmployess) {
        this.numberOfEmployess = numberOfEmployess;
    }

    @Override
    public double tax(){
        double basicTax;
        if(numberOfEmployess < 10){
            basicTax = getAnnualIncome() * 0.16;
        }
        else{
            basicTax = getAnnualIncome() * 0.14;
        }
        if(basicTax < 0){
            return 0;
        } else{
            return basicTax;
        }
    }
}
