package inheritance_polymorphism.entities;
public class individualPerson extends Person{
    private Double healthSpending;

    public individualPerson(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }
    public individualPerson() {
    }

    public Double getHealthSpending() {
        return healthSpending;
    }
    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public double tax(){
        double basicTax;
        if(getAnnualIncome() < 20000.00){
            basicTax = getHealthSpending() * 0.15;
        } else{
            basicTax = getHealthSpending() * 0.25;
        }
        basicTax = basicTax - (getHealthSpending() * 0.50);
        if(basicTax < 0 ){
            return 0;
        } else{
            return basicTax;
        }
    }

}
