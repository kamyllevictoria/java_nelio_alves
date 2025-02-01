package interfaces.services;

import interfaces.entities.Contract;
import interfaces.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getTotalValue()/months;
        for(int i = 1; i <= months; i++){
            LocalDate dueDate = LocalDate.ofEpochDay(contract.getDate().getMonth());

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstalments().add(new Installment(dueDate, quota));
        }

    }
}
