public class CreditCardPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid using Credit Card: "+amount);
    }
    
}
