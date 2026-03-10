package ProblematicCode;

public class DinersCreditCard extends CreditCard{

    @Override
    public void swipeAndPay() {
        // Implementation for Diners card swipe and pay
        System.out.println("Diners card swipe and pay");
    }

    @Override
    public void doRefund() {
        // Implementation for Diners card refund
        System.out.println("Diners card refund");
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

    @Override
    public void upiPayment() {
        // Implementation for Diners card UPI payment
        System.out.println("Diners card UPI payment");
    }

    @Override
    public void intlPayment() {
        // Implementation for Diners card international payment
        System.out.println("Diners card international payment");
    }

}