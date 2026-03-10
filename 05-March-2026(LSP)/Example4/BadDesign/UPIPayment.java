public class UPIPayment extends Payment{

    public void processPayment(double amount){
        System.out.println("Paid "+ amount +" using UPI");
    }
}