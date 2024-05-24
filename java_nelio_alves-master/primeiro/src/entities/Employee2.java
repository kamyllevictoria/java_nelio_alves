package entities;

public class Employee2 {
    private Integer ID;
    private String name;
    private Double salary;

    public Employee2(Integer id, String name, Double salary) {
        this.ID = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        this.salary += this.salary * percentage / 100;
    }
}
