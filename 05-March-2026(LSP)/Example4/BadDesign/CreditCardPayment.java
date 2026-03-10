public class CreditCardPayment extends Payment{
    public void processPayment(double amount){
        System.out.println("Paid "+ amount +" using Credit Card");
    }
}