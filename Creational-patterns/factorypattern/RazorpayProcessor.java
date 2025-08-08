package factorypattern;

public class RazorpayProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + amount + " INR via Razorpay");
    }
}
