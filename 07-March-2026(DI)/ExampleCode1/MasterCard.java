public class MasterCard extends CreditCard implements RefundCompatibleCC {
    public RefundAlgorithm refundAlgorithm;
    @Override
    public void swipeAndPay() {
        System.out.println("Swiping MasterCard and making payment.");
    }

    @Override
    public void onlinePayment() {
        System.out.println("Making online payment with MasterCard.");
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tapping MasterCard to make payment.");
    }

    @Override
    public void refundAmount() {
        refundAlgorithm.Algo1();
    }
    
}
