package StrategyPattern;


public class DinersCreditCard extends CreditCard  {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private String cvv;
    @Override
    public void swipeAndPay() {
        // Implementation for Diners card swipe and pay
        System.out.println("Diners card swipe and pay");
    }

    @Override
    public void onlinePayment() {
        // Implementation for Diners card online payment
        System.out.println("Diners card online payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for Diners card tap and pay
        System.out.println("Diners card tap and pay");
    }

    // public void doRefund(){
    //     // Implementation for Diners card refund
    //     System.out.println("Diners card refund");
    // }
    
}
