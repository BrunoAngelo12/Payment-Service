package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
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
        return "num: " + this.number + ", date: " + date.format(fmt) + ", valor: " + this.totalValue; 
    }
    
}
