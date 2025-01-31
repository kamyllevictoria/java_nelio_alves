package interfaces.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate date;
    private Double amount;

    public Installment(LocalDate date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public Installment() {

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /*public void dueDate(int valueInstallments, LocalDate contractData, double contractValue, int n){
        int month = contractData.getMonthValue();
        double baseInstallment = contractValue/ n;
        double total = 0;

        for(int i = 1; i <= valueInstallments; i++){
            month++;
            if(month > 12){
                month = 1;
                contractData = contractData.plusYears(1);
            }

            double installmentWithTax = baseInstallment + (baseInstallment * 0.01 * i);
            installmentWithTax += installmentWithTax * 0.02;

            total += installmentWithTax;

            System.out.print(contractData.getDayOfMonth() + "/" + "0" + (month < 12 ? + month : month) + "/" +contractData.getYear() + ": R$"+ installmentWithTax + "\n");
        }
    }*/

    @Override
    public String toString(){
        return date.format(fmt) + " - " +  String.format("%.2f", amount);
    }

}