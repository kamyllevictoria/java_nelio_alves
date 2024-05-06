package entities;

public class DollarPrice {

    public static double dollar;
    public static double quantity;

    public static double taxDollar(double dollar, double quantity) {
        return ((dollar * quantity)* 0.06);
    }

    public static double totalWithTax(double dollar, double quantity){
        return (dollar * quantity) + ((dollar * quantity)* 0.06);
    }
}
