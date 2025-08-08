package payment;

public class UpiPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}
