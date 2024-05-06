package objects_introduction;
import entities.DollarPrice;

import java.util.Locale;
import java.util.Scanner;


public class program07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What's the dollar price? ");
        double dollarP = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double dollarQ = sc.nextDouble();

        DollarPrice.dollar = dollarP;
        DollarPrice.quantity = dollarQ;

        double totalDollars = DollarPrice.taxDollar(dollarP, dollarQ);
        double totalWithTax = DollarPrice.totalWithTax(dollarP, dollarQ);

        System.out.printf("Dollars: R$ %.2f", dollarP);
        System.out.printf("\nQuantity: R$ %.2f", dollarQ);
        System.out.printf("\nIOF: R$ %.2f", totalDollars);
        System.out.printf("\nTotal with IOF tax: %.2f", totalWithTax);

        sc.close();
    }
}
