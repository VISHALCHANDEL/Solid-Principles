public class Main {

    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment upiPayment = new UPIPayment();
        Payment freePayment = new FreePayment();
        makePayment(freePayment ,0);
        makePayment(upiPayment,200);
        makePayment(creditCardPayment,500);
        
    }

    public static void makePayment(Payment payment,double amount){
        payment.processPayment(amount);
    }
}
