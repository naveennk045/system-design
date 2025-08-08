// Step 1: Target interface (what the client expects)
interface PaymentProcessorI {
    void pay(double amount);
}

// Step 2: Adaptee (existing/third-party class)
class ThirdPartyPaymentGateway {
    public void makePayment(int valueInCents) {
        System.out.println("Paid " + valueInCents + " cents using Third Party Gateway.");
    }
}

// Step 3: Adapter
class PaymentAdapter implements PaymentProcessorI {
    private ThirdPartyPaymentGateway gateway;

    public PaymentAdapter(ThirdPartyPaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pay(double amount) {
        int valueInCents = (int) (amount * 100); // Convert dollars to cents
        gateway.makePayment(valueInCents);
    }
}

// Step 4: Client code
public class AdapterPattern {
    public static void main(String[] args) {
        // Client wants to use PaymentProcessor interface
        PaymentProcessorI processor = new PaymentAdapter(new ThirdPartyPaymentGateway());
        processor.pay(150.75); // Client doesn't know about cents conversion
    }
}
