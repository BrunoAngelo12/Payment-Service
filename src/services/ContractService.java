package services;

import java.time.format.DateTimeFormatter;

import entities.Contract;
import entities.Installment;

public class ContractService {
    
    private OnlinePaymentService service;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void processContract(Contract contract, Integer months){
        for(int i = 1; i <= months; i++){
            double originalInstallmentAmount = contract.getInstallment()[i-1].getAmount();
            double interest = service.interest(originalInstallmentAmount, i);
            double paymentFee = service.paymentFee(originalInstallmentAmount + interest);
            contract.getInstallment()[i-1].setAmount(originalInstallmentAmount + paymentFee + interest);
        }
    }

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }

}
