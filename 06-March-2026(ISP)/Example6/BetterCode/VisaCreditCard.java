package BetterCode;

public class VisaCreditCard extends CreditCard implements RefundCompatibleCreditCard{
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private String cvv;
    @Override
     public void swipeAndPay() {
          // Implementation for Visa card swipe and pay
          System.out.println("Visa card swipe and pay");
     }
    
     @Override
     public void onlinePayment() {
          // Implementation for Visa card online payment
          System.out.println("Visa card online payment");
     }
    
     @Override
     public void tapAndPay() {
          // Implementation for Visa card tap and pay
          System.out.println("Visa card tap and pay");
     }    

     public void doRefund(){
        // Implementation for Visa card refund
        System.out.println("Visa card refund");
     }
}
