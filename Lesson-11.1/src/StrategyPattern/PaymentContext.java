package StrategyPattern;

public class PaymentContext {
    private PaymentService paymentService;

    public PaymentContext(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void doPayment() {
        paymentService.doPayment();
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}