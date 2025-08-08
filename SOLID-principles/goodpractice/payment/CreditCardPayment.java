package payment;

public class CreditCardPayment implements PaymentMethod {
     public void pay(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}
