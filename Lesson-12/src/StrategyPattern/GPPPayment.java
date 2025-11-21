package StrategyPattern;

public class GPPPayment implements PaymentService {
    @Override
    public void doPayment() {
        System.out.println("Processing GPP Payment");
    }
}