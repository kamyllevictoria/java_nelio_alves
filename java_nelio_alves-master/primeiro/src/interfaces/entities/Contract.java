package interfaces.entities;

import java.util.Date;

public class Contract {
    public int contractNumber;
    public Date contractDate;
    public Double contractValue;
    public int contractInstallment;


    public Contract(int contractNumber, Date contractDate, Double contractValue, int contractInstallment) {
        this.contractNumber = contractNumber;
        this.contractDate = contractDate;
        this.contractValue = contractValue;
        this.contractInstallment = contractInstallment;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public Double getContractValue() {
        return contractValue;
    }

    public int getContractInstallment() {
        return contractInstallment;
    }

}
