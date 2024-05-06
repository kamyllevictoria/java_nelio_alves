package entities;

public class Product2 {
     String name;
    private double price;
    private int quantity;


    public Product2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProduct(int quantity){
        this.quantity += quantity;

    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());


    }


}