public class Visa extends CreditCard implements RefundCompatibleCC {
    public RefundLogic refundAlgorithm;

    // instantiate the refundAlgorithm in the constructor
    public Visa() {
        this.refundAlgorithm = new SameInstrumentRefund();
    }
    @Override
    public void swipeAndPay() {
        System.out.println("Swiping Visa card and making payment.");
    }

    @Override
    public void refundAmount() {
        refundAlgorithm.doRefund();
    }

    @Override
    public void onlinePayment() {
        System.out.println("Making online payment with Visa card.");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tapping Visa card to make payment.");
    }

    
}