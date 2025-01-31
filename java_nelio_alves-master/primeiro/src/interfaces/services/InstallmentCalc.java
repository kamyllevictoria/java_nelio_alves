package interfaces.services;



import java.time.LocalDate;

public class InstallmentCalc {

    public void dueDate(int valueInstallments, LocalDate contractData, double contractValue, int n){
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
    }

}
