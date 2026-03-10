package ProblematicCode;

public class VisaCreditCard extends CreditCard {

    @Override
    public void swipeAndPay() {
        // Implementation for Visa card swipe and pay
        System.out.println("Visa card swipe and pay");
    }

    @Override
    public void doRefund() {
        // Implementation for Visa card refund
        System.out.println("Visa card refund");
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

    @Override
    public void upiPayment() {
        // Implementation for Visa card UPI payment
        System.out.println("Visa card UPI payment");
    }
    @Override
    public void intlPayment() {
        // Implementation for Diners card international payment
        System.out.println("Diners card international payment");
    }
}
