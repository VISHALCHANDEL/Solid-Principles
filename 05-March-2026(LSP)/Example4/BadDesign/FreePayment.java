public class FreePayment extends Payment{
    public void processPayment(double amount){
        throw new UnsupportedOperationException("Free payment cannot process money");
    }
}