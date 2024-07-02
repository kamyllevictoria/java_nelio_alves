package inheritance_polymorphism.entities;

import java.time.LocalDate;

public class UsedProduct extends Product{
    protected LocalDate manufactureDate;

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct() {
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName()
                + " (used) $"
                + getPrice()
                + " (Manufacture date: "
                + manufactureDate.toString()
                + ")";
    }
}
