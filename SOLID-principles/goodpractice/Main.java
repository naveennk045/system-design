import logging.ConsoleLogger;
import logging.TransactionLogger;
import notification.EmailReceiptSender;
import notification.ReceiptSender;
import payment.PaymentMethod;
import payment.UpiPayment;

public class Main {
    public static void main(String[] args) {
        PaymentMethod payment = new UpiPayment();
        TransactionLogger logger = new ConsoleLogger();
        ReceiptSender sender = new EmailReceiptSender();

        CheckoutService service = new CheckoutService(payment, logger, sender);
        service.checkout(500.0, "user@example.com");
    }
}
