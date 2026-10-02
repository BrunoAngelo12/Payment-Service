package services;

public class PaypalService implements OnlinePaymentService {
    
    public Double paymentFee(Double amount){
        return 0.02 * amount + amount;
    }

    public Double interest(Double amount, Integer months){
        return months / 100.0 * amount + amount;
    }

}
