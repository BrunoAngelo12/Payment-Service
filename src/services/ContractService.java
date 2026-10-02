package services;

import java.time.format.DateTimeFormatter;

import entities.Contract;
import entities.Installment;

public class ContractService {
    
    private OnlinePaymentService service;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void processContract(Contract contract, Integer months){
        for(int i = 1; i <= months; i++){
            contract.getInstallment()[i-1].setAmount(service.interest(contract.getInstallment()[i-1].getAmount(), i));
            contract.getInstallment()[i-1].setAmount(service.paymentFee(contract.getInstallment()[i-1].getAmount()));
        }
        System.out.println("Parcelas:");
        for(int i = 0; i < months; i++){
            System.out.print(contract.getInstallment()[i].getDueDate().format(fmt));
            System.out.printf(" %.2f\n", contract.getInstallment()[i].getAmount());
        }
    }

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }

}
