package BetterCode;

public class RupayCreditCard extends CreditCard implements UpiCompatibleCreditCard , RefundCompatibleCreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private String cvv;
    @Override
    public void swipeAndPay() {
        // Implementation for Rupay card swipe and pay
        System.out.println("Rupay card swipe and pay");
    }

    @Override
    public void onlinePayment() {
        // Implementation for Rupay card online payment
        System.out.println("Rupay card online payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for Rupay card tap and pay
        System.out.println("Rupay card tap and pay");
    }
    @Override
    public void upiPayment() {
        // Implementation for Rupay card UPI payment
        System.out.println("Rupay card UPI payment");
    }

    public void doRefund(){
        // Implementation for Rupay card refund
        System.out.println("Rupay card refund");
    }
    
}
