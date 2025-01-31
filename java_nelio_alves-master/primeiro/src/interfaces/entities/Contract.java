package interfaces.entities;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    public Integer number;
    public Date date;
    public Double totalValue;

    private List<interfaces.entities.Installment> instalments = new ArrayList<>();

    public Contract() {
    }

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Contract(int contractNumber, LocalDate contractData, double contractValue) {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<interfaces.entities.Installment> getInstalments() {
        return instalments;
    }
}
