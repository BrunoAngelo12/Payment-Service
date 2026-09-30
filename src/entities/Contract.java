package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;

    private Installment[] installment;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Contract(Integer number, LocalDate date, Double totalValue, int numberOfInstallments) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.installment = new Installment[numberOfInstallments];
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    @Override 
    public String toString(){
        return "Num: " + this.number + ", Date: " + date.format(fmt) + ", Value: " + this.totalValue; 
    }

    public Installment[] getInstallment() {
        return installment;
    }

    public void setInstallment(Installment[] installment) {
        this.installment = installment;
    }
    
}
