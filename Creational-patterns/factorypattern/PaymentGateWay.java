package factorypattern;

public class PaymentGateWay {
    public static PaymentProcessor getPaymentProcessor(String country) {
        switch(country) {
            case "IN":
                return new RazorpayProcessor();
            case "US":
                return new PayPalProcessor();
            default:
                return new StripeProcessor();
        }
    }
}
