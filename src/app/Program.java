package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.OnlinePaymentService;
import services.PaypalService;

public class Program{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double contractValue = sc.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        int numberOfInstallments = sc.nextInt();
        
        Contract contract = new Contract(number, contractDate, contractValue, numberOfInstallments);

        ContractService obj = new ContractService(new PaypalService());
        obj.processContract(contract, numberOfInstallments);
        
        sc.close();
    }
}