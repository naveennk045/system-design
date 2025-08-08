package notification;

public class EmailReceiptSender implements ReceiptSender {
    public void send(String email) {
        System.out.println("Sending receipt to " + email);
    }
}
