package payment;

public class CryptoPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Processing crypto payment of ₹" + amount);
    }
}
