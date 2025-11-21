package StrategyPattern;

public class Practice {
    public static void main(String[] args) {

        PaymentService gpp = new GPPPayment();
        PaymentService green = new GreenPay();
        PaymentService yigim = new YigimPay();

        gpp.doPayment();
        green.doPayment();
        yigim.doPayment();

        System.out.println("\n=== Using Strategy Context ===");
        PaymentContext context = new PaymentContext(new GPPPayment());
        context.doPayment();

        context.setPaymentService(new GreenPay());
        context.doPayment();

        context.setPaymentService(new YigimPay());
        context.doPayment();
    }
}