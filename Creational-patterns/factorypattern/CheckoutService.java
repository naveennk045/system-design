package factorypattern;

public class CheckoutService {
    public static void main(String[] args) {
        PaymentProcessor payment = PaymentGateWay.getPaymentProcessor("IN");
        payment.processPayment(1500.0);

        PaymentProcessor payment2 = PaymentGateWay.getPaymentProcessor("US");
        payment2.processPayment(50.0);
    }
}
