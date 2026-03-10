package StrategyPattern;


public class MasterCreditCard extends CreditCard implements RefundCompatibleCreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private String cvv;

    private RefundStrategy refundStrategy;

    public MasterCreditCard() {
        this.refundStrategy = new BankAccountRefundStrategy()
;    }
    @Override
    public void swipeAndPay() {
        // Implementation for MasterCard card swipe and pay
        System.out.println("MasterCard card swipe and pay");
    }

    @Override
    public void onlinePayment() {
        // Implementation for MasterCard card online payment
        System.out.println("MasterCard card online payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for MasterCard card tap and pay
        System.out.println("MasterCard card tap and pay");
    }

    // public void doRefund(){
    //     // Implementation for MasterCard card refund
    //     System.out.println("MasterCard card refund");
    // }

    public void doRefund(){
        this.refundStrategy.doRefund();
    }
    
}
