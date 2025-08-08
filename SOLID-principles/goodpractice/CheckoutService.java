import logging.TransactionLogger;
import notification.ReceiptSender;
import payment.PaymentMethod;

public class CheckoutService {
    private PaymentMethod paymentMethod;
    private TransactionLogger logger;
    private ReceiptSender receiptSender;

    public CheckoutService(PaymentMethod paymentMethod, TransactionLogger logger, ReceiptSender receiptSender) {
        this.paymentMethod = paymentMethod;
        this.logger = logger;
        this.receiptSender = receiptSender;
    }

    public void checkout(double amount, String email) {
        paymentMethod.pay(amount);
        logger.log("Payment of ₹" + amount + " processed.");
        receiptSender.send(email);
    }
}
