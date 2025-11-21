package StrategyPattern;

public class GreenPay implements PaymentService {
    @Override
    public void doPayment() {
        System.out.println("Processing Green Pay");
    }
}