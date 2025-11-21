package StrategyPattern;

public class YigimPay implements PaymentService {
    @Override
    public void doPayment() {
        System.out.println("Processing Yigim Pay");
    }
}