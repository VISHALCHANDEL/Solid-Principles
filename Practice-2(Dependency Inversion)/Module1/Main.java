public class Main {
    public static void main(String[] args) {
        PaymentMethod payment  = new UPIPayment();
        PaymentProcessor processor = new PaymentProcessor(payment);
        processor.processPayment(2000);
    }
}
