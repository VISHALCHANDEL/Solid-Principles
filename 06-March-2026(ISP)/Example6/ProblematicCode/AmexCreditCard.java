package ProblematicCode;

public class AmexCreditCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        // Implementation for Amex card swipe and pay
        System.out.println("Amex card swipe and pay");
    }

    @Override
    public void doRefund() {
        // Implementation for Amex card refund
        System.out.println("Amex card refund");
    }

    @Override
    public void onlinePayment() {
        // Implementation for Amex card online payment
        System.out.println("Amex card online payment");
    }

    @Override
    public void tapAndPay() {
        // Implementation for Amex card tap and pay
        System.out.println("Amex card tap and pay");
    }

    @Override
    public void upiPayment() {
        // Implementation for Amex card UPI payment
        System.out.println("Amex card UPI payment");
    }
    @Override
    public void intlPayment() {
        // Implementation for Diners card international payment
        System.out.println("Diners card international payment");
    }
    
}
