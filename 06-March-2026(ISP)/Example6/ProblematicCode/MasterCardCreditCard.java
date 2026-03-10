package ProblematicCode;

public class MasterCardCreditCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        // Implementation for MasterCard card swipe and pay
        System.out.println("MasterCard card swipe and pay");
    }

    @Override
    public void doRefund() {
        // Implementation for MasterCard card refund
        System.out.println("MasterCard card refund");
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

    @Override
    public void upiPayment() {
        // Implementation for MasterCard card UPI payment
        System.out.println("MasterCard card UPI payment");
    }
    @Override
    public void intlPayment() {
        // Implementation for Diners card international payment
        System.out.println("Diners card international payment");
    }
    
}
