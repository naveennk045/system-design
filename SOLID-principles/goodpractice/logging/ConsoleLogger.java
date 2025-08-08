package logging;

public class ConsoleLogger implements TransactionLogger {
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
