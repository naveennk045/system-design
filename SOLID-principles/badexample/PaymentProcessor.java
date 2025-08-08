public class PaymentProcessor {

    public void process(String type, double amount) {
        if (type.equals("CreditCard")) {
            System.out.println("Processing credit card payment of ₹" + amount);
            logTransaction("Credit Card payment");
            sendReceipt("user@example.com");
        }
        else if (type.equals("UPI")) {
            System.out.println("Processing UPI payment of ₹" + amount);
            logTransaction("UPI payment");
            sendReceipt("user@example.com");
        }
        else if (type.equals("Crypto")) {
            System.out.println("Processing crypto payment of ₹" + amount);
            logTransaction("Crypto payment");
            sendReceipt("user@example.com");
        }
    }

    public void logTransaction(String message) {
        System.out.println("Logging: " + message);
    }

    public void sendReceipt(String email) {
        System.out.println("Sending receipt to " + email);
    }
}
